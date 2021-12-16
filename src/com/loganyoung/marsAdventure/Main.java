package com.loganyoung.marsAdventure;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your unique mars adventure. Please buckle up and enjoy the ride!");
        System.out.println("loading...");
        ;
        System.out.println("loading...");
        ;
        System.out.println("loading...");
        ;
        System.out.println("loading...");
        ;
        System.out.println("jk we're ready!");
        System.out.println("What is your name, traveler?");
        String userName = input.nextLine();
        System.out.println(userName + "? That's a wonderful name. Hope you're ready for it to be written in the history books!");
        System.out.println("Are you feeling nervous about the trip? Y or N");
        String nervous = input.nextLine();
        if (nervous.equals("Y")) {
            System.out.println("That's totally normal. Here are a few tips to keep in mind on your journey:");
            System.out.println("1. Drink water! We think there'll be some when we get there though");
            System.out.println("2. Don't forget to breathe :-)");
        } else if (nervous.equals("N")) {
            System.out.println("Think you're tough? Mars is deadly...hope you're as strong as you're behaving!");
        } else {
            System.out.println("Well, regardless it's gonna be a blast.");
        }
        System.out.println("Let's get some logistics established first, however. You're allowed " +
                "one animal to bind your dna to and become your animorph. What animal do you choose?");

        String animal = input.nextLine();
        System.out.println("what an...interesting choice. So you want to morph into a " + animal + "?");
        System.out.println("It's your adventure, we're just living in it (I guess) so " + animal + " it is then!");

        System.out.println("How many bags did you pack for your trip?");
        int bags = 0;
        try {
            bags = input.nextInt();
            if (bags > 5) {
                System.out.println("Got Dayum!! I knew I should have retrofit a roof rack on this ship. We'll make it work, though.");
            } else {
                System.out.println("Great, I'll take those and toss them in the cargo bay for ya.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Not sure what you mean, but I'm sure we'll have space for whatever you have. If not you can always rent a locker" +
                    "in the void! Seriously. Toss it out the window and I doubt anyone will complain you're polluting.");
        }

        System.out.println("Now then...let's pick our ship. We have a few options!");
        System.out.println("1 ----- slim, chic, electric (but no cup holders)");
        System.out.println("2 ----- the trusty bucket. A clunker but virtually indestructible (still no cup holders!)");
        System.out.println("3 ----- a hybrid - pretty sure this puppy has a small engine ripped from martian weed whackers (cup holders though!!!)");

        Integer ship = 0;
        try{
            ship = input.nextInt();
            switch (ship) {
            case (1) -> System.out.println("This ev is gonna quietly hum its way into the stars!");
            case (2) -> System.out.println("Just make sure you buckle up! If we break down things could get ugly...");
            case (3) -> System.out.println("Finally! Someone wants to ride with me in the hybrid. I hate carrying my Big Gulp.");
            default -> System.out.println("Guess I'll have to pick...That's okay. I've been wanting to test drive the hybrid!");
        }
        } catch(InputMismatchException e) {
            System.out.println("Didn't seem like a hard question but whatever...on to the next item on our agenda! Liftoff!");
        }

        System.out.println("Now that we have the logistics taken care of, let's see... looks like it's one human, " +bags + "bags, and one " +animal+ "/human hybrid, blasting through space. Buckle up!");
        System.out.println("Countdown to blast off...");
        System.out.println("5...");
        System.out.println("4...");
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println("LIFTOFF!");


    }
}
