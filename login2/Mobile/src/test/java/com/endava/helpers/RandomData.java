package com.endava.helpers;

import com.github.javafaker.Faker;

public class RandomData {

    public static String generateRandomData() {
        Faker faker = new Faker();
        return new Faker().pokemon().name() + faker.pokemon().name();
    }
}
