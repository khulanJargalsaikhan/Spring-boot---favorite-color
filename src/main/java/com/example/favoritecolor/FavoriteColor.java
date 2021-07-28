package com.example.favoritecolor;

import java.util.ArrayList;
import java.util.Random;

public class FavoriteColor {
    private String name;
    private String quest;
    ArrayList<String> question3 = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String randQuestion(){
        question3.add("What is your favorite color?");
        question3.add("What is the airspeed velocity of an unladen swallow?");
        Random rand = new Random();
        int randQuesIndex = rand.nextInt(1) + 1;
        String randQues = question3.get(randQuesIndex);
        return randQues;
    }


    public ArrayList<String> getQuestion3() {
        return question3;
    }

    public void setQuestion3(ArrayList<String> question3) {
        this.question3 = question3;
    }
}
