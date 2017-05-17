package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Application {

    //{"username":"bsheen","auth_token":"Z4yM7aLK9aiN8tLPhDeu"}

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        User me = restTemplate.getForObject("https://www.beeminder.com/api/v1/users/me?auth_token=Z4yM7aLK9aiN8tLPhDeu", User.class);
        System.out.println(me);

        Object object = restTemplate.getForObject("https://www.beeminder.com/api/v1/users/me/goals.json?auth_token=Z4yM7aLK9aiN8tLPhDeu", String.class);
        System.out.println(object);

        CreateGoal createGoal = new CreateGoal();
        createGoal.setSlug("exercise");
        createGoal.setTitle("exercise 3 times a week");
        createGoal.setGoal_type("hustler");
        createGoal.setGoalval(3);
        createGoal.setGoaldate(1495505502);

        Object obj = restTemplate.postForObject("https://www.beeminder.com/api/v1/users/me/goals.json?auth_token=Z4yM7aLK9aiN8tLPhDeu",createGoal,String.class);
        System.out.println(obj);
        
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization","Bearer Z4yM7aLK9aiN8tLPhDeu");
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//        Object object1 = restTemplate.exchange("https://www.beeminder.com/api/v1/users/me/goals.json", HttpMethod.GET, entity, String.class);
//        System.out.println(object1);


    }

}
