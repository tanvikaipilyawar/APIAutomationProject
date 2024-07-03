package org.example.utils;

public class Faker {
    Faker faker;
    public String getFirstName(){
        faker= new Faker();
       return faker.getFirstName();
    }

    public String getLastName(){
        return faker.getLastName();
    }
}
