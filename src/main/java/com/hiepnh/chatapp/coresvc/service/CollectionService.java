package com.hiepnh.chatapp.coresvc.service;

import com.hiepnh.chatapp.coresvc.domain.request.CreateCollectionRequest;
import com.hiepnh.chatapp.coresvc.domain.response.BaseResponse;
import com.hiepnh.chatapp.coresvc.domain.response.GetArrayResponse;
import com.hiepnh.chatapp.coresvc.entites.CollectionEntity;

public interface CollectionService {

    GetArrayResponse<CollectionEntity> searchCollection(String text, int page, int size);

    BaseResponse createCollection(CreateCollectionRequest request);
}
