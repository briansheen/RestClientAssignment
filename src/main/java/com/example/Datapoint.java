package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by bsheen on 5/16/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Datapoint {
    private String id;
    private Long timestamp;
    private String daystamp;
    private Double value;
    private String comment;
    private Long updated_at;
    private String requestid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDaystamp() {
        return daystamp;
    }

    public void setDaystamp(String daystamp) {
        this.daystamp = daystamp;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Long updated_at) {
        this.updated_at = updated_at;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    @Override
    public String toString() {
        return "Datapoint{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", daystamp='" + daystamp + '\'' +
                ", value=" + value +
                ", comment='" + comment + '\'' +
                ", updated_at=" + updated_at +
                ", requestid='" + requestid + '\'' +
                '}';
    }
}

