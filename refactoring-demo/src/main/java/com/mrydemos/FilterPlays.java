package com.mrydemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterPlays {
    public static void main(String[] args) {
        List<Play> plays = Arrays.asList(
                new Play("Hamlet", "Tragedy"),
                new Play("Much Ado About Nothing", "Comedy"),
                new Play("Macbeth", "Tragedy"),
                new Play("The Comedy of Errors", "Comedy")
        );

        List<Play> comedyPlays = new ArrayList<>();
        for (Play play : plays) {
            if (play.type.equals("Comedy")) {
                comedyPlays.add(play);
            }
        }

        System.out.println("Comedy plays: " + comedyPlays);
    }
}
