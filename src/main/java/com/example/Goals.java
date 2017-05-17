package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bsheen on 5/16/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Goals {
    private Goal[] goals;

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "Goals{" +
                "goals=" + Arrays.toString(goals) +
                '}';
    }
}
