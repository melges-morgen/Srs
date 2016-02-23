package ru.ogify.srs.stash.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by melge on 20.02.2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StashProject {
    private String key;
    private long id;
    private String name;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
