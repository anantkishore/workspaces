package com.kishore.anant.MongoDB;


import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;  

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        
        MongoClient mongoClient = new MongoClient();
        
        MongoDatabase database = mongoClient.getDatabase("TheDatabaseName");
        
        List<Integer> books = Arrays.asList(27464, 747854);
        DBObject person = new BasicDBObject("_id", "jo")
                                    .append("name", "Jo Bloggs")
                                    .append("address", new BasicDBObject("street", "123 Fake St")
                                                                 .append("city", "Faketon")
                                                                 .append("state", "MA")
                                                                 .append("zip", 12345))
                                    .append("books", books);
        
        MongoCollection<Document> collection = database.getCollection("people");
        
        Document document = new Document("_id", "jo");
        
        collection.insertOne(document);
        
        
        
    }
    
    
    
}
