package com.hiepnh.chatapp.coresvc;

import com.hiepnh.chatapp.coresvc.common.CollectionNameDefs;
import com.hiepnh.chatapp.coresvc.domain.db.MongoDbOnlineSyncActions;
import org.bson.Document;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {

    private final MongoDbOnlineSyncActions db;

    public Test(MongoDbOnlineSyncActions db) {
        this.db = db;
    }

    @Override
    public void run(String... args) throws Exception {

        Document doc = new Document();
        doc.append("aaa","aa");

        db.insertOne(CollectionNameDefs.COLL_USER, doc);
    }
}
