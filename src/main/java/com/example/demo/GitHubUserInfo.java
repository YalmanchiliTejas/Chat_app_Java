package com.example.demo;
import java.util.*;
public class GitHubUserInfo {
    private Map <String , Object> attributes = new HashMap<>();

    public GitHubUserInfo(Map <String, Object> map) {
        this.attributes = map;
    }
    public String getId() {
        return(String) (attributes.get("sub"));

    }
    public String getName() {
        return (String) (attributes.get("name"));
    }
    public String getEmail() {
        return (String) (attributes.get("email"));
    }
}
