package com.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bsheen on 5/16/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String username;
    private String timezone;
    private Boolean deadbeat;
    private Long updated_at;
    private String id;
    private List<String> goals;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean getDeadbeat() {
        return deadbeat;
    }

    public void setDeadbeat(Boolean deadbeat) {
        this.deadbeat = deadbeat;
    }

    public Long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Long updated_at) {
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGoals() {
        return goals;
    }

    public void setGoals(List<String> goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", timezone='" + timezone + '\'' +
                ", deadbeat=" + deadbeat +
                ", updated_at=" + updated_at +
                ", id='" + id + '\'' +
                ", goals=" + goals +
                '}';
    }
}
