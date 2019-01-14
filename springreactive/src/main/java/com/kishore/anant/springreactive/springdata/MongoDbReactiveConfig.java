package com.kishore.anant.springreactive.springdata;


import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@EnableReactiveMongoRepositories
public class MongoDbReactiveConfig extends AbstractReactiveMongoConfiguration {


    @Override
    public  MongoClient reactiveMongoClient(){
        return MongoClients.create();
    }

    @Override
    public String getDatabaseName(){
        return "reactive_mongoDB";
    }
    
}