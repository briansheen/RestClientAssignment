package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

public class Application {

    //{"username":"bsheen","auth_token":"Z4yM7aLK9aiN8tLPhDeu"}

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        User me = restTemplate.getForObject("https://www.beeminder.com/api/v1/users/me?auth_token=Z4yM7aLK9aiN8tLPhDeu", User.class);
        System.out.println(me);




    }

}
