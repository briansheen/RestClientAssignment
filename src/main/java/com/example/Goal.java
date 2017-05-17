package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by bsheen on 5/16/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Goal {
    private String slug;
//    private Long updated_at;
//    private String title;
//    private String fineprint;
//    private Long goaldate;
//    private Double goalval;
    //private String goal_type;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }


    @Override
    public String toString() {
        return "Goal{" +
                "slug='" + slug + '\'' +
                '}';
    }
}
