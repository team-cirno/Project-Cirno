package Testing;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class DBtesting {
  public static void main(String[] args) {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
  }
}