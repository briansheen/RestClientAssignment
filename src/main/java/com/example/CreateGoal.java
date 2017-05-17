package com.example;

/**
 * Created by bsheen on 5/16/17.
 */
public class CreateGoal {

    private String slug;
    private String title;
    private String goal_type;
    private Number goaldate;
    private Number goalval;
    private Number rate;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGoal_type() {
        return goal_type;
    }

    public void setGoal_type(String goal_type) {
        this.goal_type = goal_type;
    }

    public Number getGoaldate() {
        return goaldate;
    }

    public void setGoaldate(Number goaldate) {
        this.goaldate = goaldate;
    }

    public Number getGoalval() {
        return goalval;
    }

    public void setGoalval(Number goalval) {
        this.goalval = goalval;
    }

    public Number getRate() {
        return rate;
    }

    public void setRate(Number rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "CreateGoal{" +
                "slug='" + slug + '\'' +
                ", title='" + title + '\'' +
                ", goal_type='" + goal_type + '\'' +
                ", goaldate=" + goaldate +
                ", goalval=" + goalval +
                ", rate=" + rate +
                '}';
    }
}
