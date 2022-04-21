package com.hiepnh.chatapp.coresvc.entites.dto;

import com.hiepnh.chatapp.coresvc.entites.CategoryEntity;
import com.hiepnh.chatapp.coresvc.entites.ItemEntity;
import lombok.Data;

import java.util.List;

@Data
public class CollectionDetailDTO {

    private Integer id;

    private String name;

    private String description;

    private String image;

    private String bannerImg;

    private List<CategoryEntity> categories;

    private List<ItemEntity> items;
}
