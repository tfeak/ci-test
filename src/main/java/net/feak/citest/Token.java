package net.feak.citest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Token {

    private String id;

    public Token(String id) {
        this.id = id;
    }

    @JsonProperty
    public String getId() {
        return this.id;
    }
}
