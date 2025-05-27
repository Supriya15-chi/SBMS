package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {

    public static String generateWishMessage() {
        int currentHour = LocalTime.now().getHour();

        if (currentHour >= 0 && currentHour < 12) {
            return "Good Morning!";
        } else if (currentHour >= 12 && currentHour < 18) {
            return "Good Afternoon!";
        } else {
            return "Good Evening!";
        }
    }

    public static void main(String[] args) {
        System.out.println(generateWishMessage());
    }
}

