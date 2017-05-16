package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

public class Application {

    //{"username":"bsheen","auth_token":"Z4yM7aLK9aiN8tLPhDeu"}

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String temp = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", String.class);
        System.out.println(temp);
    }

}
