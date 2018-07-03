package server;

import client.IChatClient;

/**
 * A class used by the server program to keep
 * details of connected clients ordered
 *
 */
public class Chatter {
    public String name;
    public IChatClient client;

    //constructor
    public Chatter(String name, IChatClient client){
            this.name = name;
            this.client = client;
    }

    //getters and setters
    public String getName(){
            return name;
    }
    public IChatClient getClient(){
            return client;
    }
}
