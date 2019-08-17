package com.jiangong.demo.service;

import com.jiangong.demo.entity.database.Choose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Choose_service {
    @Autowired
    MongoOperations mongoOperations;

    public void updateChoose(String test, String key,String value){
        mongoOperations.updateFirst(
                new Query(Criteria.where("test").is(test)),
                Update.update(key,value),
                Choose.class);
    }
}
