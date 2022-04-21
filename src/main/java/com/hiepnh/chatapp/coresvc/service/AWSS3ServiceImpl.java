package com.hiepnh.chatapp.coresvc.service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.hiepnh.chatapp.coresvc.domain.response.GetSingleItemResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class AWSS3ServiceImpl extends BaseService implements AWSS3Service{

    private final AmazonS3 amazonS3;

    @Value("${application.aws.s3.bucket}")
    private String bucketName;

    public AWSS3ServiceImpl(AmazonS3 amazonS3) {
        this.amazonS3 = amazonS3;
    }


    @Override
//    @Async
    public GetSingleItemResponse<String> uploadFile(final MultipartFile multipartFile) {
        GetSingleItemResponse<String> response = new GetSingleItemResponse<>();
        logger.info("File upload in progress.");
        try {
            final File file = convertMultiPartFileToFile(multipartFile);
            String name = uploadFileToS3Bucket(bucketName, file);
            logger.info("File upload is completed.");
            file.delete();  // To remove the file locally created in the project folder.
            response.setItem(name);
            response.setSuccess();
            return response;
        } catch (final AmazonServiceException ex) {
            logger.info("File upload is failed.");
            logger.error("Error= {} while uploading file.", ex.getMessage());
            response.setResult(-1, "Error");
            return response;
        }
    }

    private File convertMultiPartFileToFile(final MultipartFile multipartFile) {
        final File file = new File(multipartFile.getOriginalFilename());
        try (final FileOutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(multipartFile.getBytes());
        } catch (final IOException ex) {
            logger.error("Error converting the multi-part file to file= ", ex.getMessage());
        }
        return file;
    }

    private String uploadFileToS3Bucket(final String bucketName, final File file) {
        final String uniqueFileName = file.getName() + "_" + System.currentTimeMillis();
        logger.info("Uploading file with name= " + uniqueFileName);
        final PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, uniqueFileName, file);
        amazonS3.putObject(putObjectRequest);
        return uniqueFileName;
    }

}
