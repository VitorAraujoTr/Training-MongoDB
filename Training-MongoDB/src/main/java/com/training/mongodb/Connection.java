package com.training.mongodb;

import java.util.Arrays;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

public class Connection {
	public static void main(String[] args) {
		// Credential connection
		String username = "";
		String database = "";
		char[] password = null;

		MongoCredential credential = MongoCredential.createCredential(username, database, password);
//		MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credential));
//		DB db = (DB) mongoClient.getDatabase("java_mongodb");

//		Local connection
//		MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credential));
//		DB db = (DB) mongoClient.getDatabase("java_mongodb");
		
//		Uri connection
//		MongoClientURI uri = new MongoClientURI("mongodb://user:pass@localhost/?authSource=db2&ssl=true");
//		MongoClient mongoClient = new MongoClient(uri);
		
		MongoClient mongoClient = new MongoClient();
		MongoDatabase database = mongoClient.getDatabase("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
