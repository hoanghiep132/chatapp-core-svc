package com.hiepnh.chatapp.coresvc.domain.request;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class CreateCollectionRequest extends BaseAuthRequest{

    private String name;

    private String description;

    private MultipartFile image;

    private MultipartFile bannerImg;

    private List<Integer> categoryIds;
}
