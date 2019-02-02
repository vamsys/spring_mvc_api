package com.springmvcapi.data;

public class SayHelloToChef {

    private final long id;
    private final String content;

    public SayHelloToChef(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

}
