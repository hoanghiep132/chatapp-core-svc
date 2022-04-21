package com.hiepnh.chatapp.coresvc.service;

import com.hiepnh.chatapp.coresvc.domain.request.CreateCollectionRequest;
import com.hiepnh.chatapp.coresvc.domain.response.BaseResponse;
import com.hiepnh.chatapp.coresvc.domain.response.GetArrayResponse;
import com.hiepnh.chatapp.coresvc.entites.CollectionEntity;
import org.springframework.stereotype.Service;

@Service
public class CollectionServiceImpl implements CollectionService{


    @Override
    public GetArrayResponse<CollectionEntity> searchCollection(String text, int page, int size) {
        return null;
    }

    @Override
    public BaseResponse createCollection(CreateCollectionRequest request) {
        return null;
    }
}
