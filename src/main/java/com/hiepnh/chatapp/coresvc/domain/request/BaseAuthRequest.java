package com.hiepnh.chatapp.coresvc.domain.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hiepnh.chatapp.coresvc.common.HeaderInfo;
import lombok.Data;

@Data
public class BaseAuthRequest {
    @JsonIgnore
    protected HeaderInfo info;
}
