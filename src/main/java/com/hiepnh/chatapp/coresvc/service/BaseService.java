package com.hiepnh.chatapp.coresvc.service;

import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected Bson buildCondition(List<Bson> lst) {
        if (lst == null || lst.isEmpty()) {
            return new Document();
        }
        if (lst.size() == 1) {
            return lst.get(0);
        }
        return Filters.and(lst);
    }

    protected List<ObjectId> buildListObjectId(List<String> ids) {
        List<ObjectId> rs = new ArrayList<>();
        for (String id : ids) {
            rs.add(new ObjectId(id));
        }
        return rs;
    }
}
