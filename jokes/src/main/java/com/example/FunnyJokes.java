package com.example;

import java.util.ArrayList;
import java.util.Random;

public class FunnyJokes {
    private ArrayList<String> jokes = new ArrayList<>();

    public FunnyJokes(){
        jokes.add("Can a kangaroo jump higher than a house? Of course, a house doesn\'t jump at all.");
        jokes.add("What is the difference between a snowman and a snowwoman?\n" +
                "-\n" +
                "Snowballs.");
        jokes.add("Scientists have now discovered how women keep their secrets. They do so within groups of 40.");
        jokes.add("My wife\'s cooking is so bad we usually pray after our food.");
        jokes.add("Police officer: \"Can you identify yourself, sir?\"\n" +
                " \n" +
                "Driver pulls out his mirror and says: \"Yes, it\'s me.\"");
        jokes.add("I can\'t believe I forgot to go to the gym today. That\'s 7 years in a row now.");
        jokes.add("A naked women robbed a bank. Nobody could remember her face.");
        jokes.add("I\'m selling my talking parrot. Why? Because yesterday, the bastard tried to sell me.");
        jokes.add("I heard women love a man in uniform. Can\'t wait to start working at McDonalds.");
        jokes.add("A conference call is the best way for a dozen people to say \"bye\" 300 times.");
        jokes.add("We can teach kids there\'s no i in team, but it\'s way more important to teach them that there\'s no a in definitely.");
        jokes.add("I once gave my husband the silent treatment for an entire week, at the end of which he declared, \"Hey, we\'re getting along pretty great lately!\"");
        jokes.add("I think it\'s pretty cool how the Chinese made a language entirely out of tattoos.");
        jokes.add("Instagram is just Twitter for people who go outside.");
        jokes.add("The closest I\'ve been to a diet this year is erasing food searches from my browser history.");
    }

    public String getJokes(){
        Random random = new Random();
        int rNumber = random.nextInt(15);
        return jokes.get(rNumber);
    }
}


