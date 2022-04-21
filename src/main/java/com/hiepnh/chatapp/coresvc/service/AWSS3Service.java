package com.hiepnh.chatapp.coresvc.service;

import com.hiepnh.chatapp.coresvc.domain.response.GetSingleItemResponse;
import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {

    GetSingleItemResponse<String> uploadFile(final MultipartFile multipartFile);
}
