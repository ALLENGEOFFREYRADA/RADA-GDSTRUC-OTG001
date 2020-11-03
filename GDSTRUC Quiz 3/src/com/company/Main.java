package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // initialize scanner

	    ArrayQueue queue = new ArrayQueue(25); // initialize array queue

        int games = 0; // counter for games
        int turns = 1; // counter for turns

        while (games < 10) { // keep going until 10 games has been made
            // Print info
            System.out.println("Turn: " + turns);
            System.out.println("Games created: " + games);
            System.out.println(System.lineSeparator());
            if (playTurn(queue)) { // play a turn, if a game was made, returns true
                games++; // increment games
            }
            turns++; // increment turns
            System.out.println(System.lineSeparator());
            System.out.println("Press ENTER to continue. \r\n");
            scanner.nextLine();
        }
    }

    public static boolean playTurn(ArrayQueue queue) {
        Random rand = new Random(); // initialize randomizer
        int playersToAdd = rand.nextInt(7) + 1; // random number of players to queue up
        // queue up randomly generated players
        for (int i = 0; i < playersToAdd; i++) {
            Player playerToAdd = new Player(rand.nextInt(200), Player.PLAYERNAMES[rand.nextInt(Player.PLAYERNAMES.length)], rand.nextInt(50));
            queue.add(playerToAdd);
            System.out.println(playerToAdd + " queueing up.");
        }

        // print players in queue
        System.out.println(System.lineSeparator());
        System.out.println("Players in queue:");
        queue.printQueue();
        System.out.println(System.lineSeparator());

        // create a game if there are five or more people in queue
        if (queue.size() >= 5) {
            System.out.println("Creating game...");
            for (int i = 0; i < 5; i++) { // remove the first five players in the queue
                System.out.println(queue.remove() + " joining a game.");
            }
            // return true to increment game counter
            return true;
        }

        // return false if there aren't enough players for a game
        System.out.println("Not enough players for a game. \r\n");

        return false;
    }
}
