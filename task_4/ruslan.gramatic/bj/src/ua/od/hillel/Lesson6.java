package ua.od.hillel;

import java.util.Scanner;

/**
 * Created by ruslangramatic on 3/4/18.
 */
public class Lesson6 {





    public static void main(String[] args) {
        //====Step-0 initialisation====
        String[] cards = {
            "6 чирва","7 чирва","8 чирва","9 чирва","10 чирва","J чирва","Q чирва","K чирва","A чирва",
            "6 буба","7 буба","8 буба","9 буба","10 буба","J буба","Q буба","K буба","A буба",
            "6 пика","7 пика","8 пика","9 пика","10 пика","J пика","Q пика","K пика","A пика",
            "6 крест","7 крест","8 крест","9 крест","10 крест","J крест","Q крест","K крест","A крест"
        };

        int[] costs = {
            6, 7, 8, 9, 10, 10, 10, 10, 11,
            6, 7, 8, 9, 10, 10, 10, 10, 11,
            6, 7, 8, 9, 10, 10, 10, 10, 11,
            6, 7, 8, 9, 10, 10, 10, 10, 11
        };

        int currentCardIndex = 0;

        int[] playersScores = new int[args.length];

        Scanner scanner = new Scanner(System.in);

        int playersInGame = args.length;

        //====Step-1====
        int[] deck = createDeck();

        //====Step-2 Prepare====
        showPlayers(args);

        //====Step-3 Shuffle====
        shuffleDeck(deck);

        //====Step-4 Play====
        play(args, playersScores, costs, deck, cards, playersInGame, currentCardIndex, scanner);

        // ====Step-5 Winners====
        showWinners(args, playersScores);
    }


    public static void play(String[] players, int[] playersScores, int[] costs, int[] deck, String[] cards,
                            int playersInGame, int currentCardIndex, Scanner scanner) {
        exit:
        do {
            System.out.format("\n======ROUND %s=====", currentCardIndex/3 + 1);
            for (int i = 0; i < players.length; i++) {
                if (playersScores[i] < 100000) {
                    System.out.format("\n%s your turn. Would you like one card more?: ", players[i]);
                    String str = scanner.nextLine();
                    switch (str) {
                        case "exit":
                            break exit;
                        case "y":
                            playersScores[i] += costs[deck[currentCardIndex]];
                            System.out.println("Your card is: (" + cards[deck[currentCardIndex]] + ") and you scored " + playersScores[i] + " points!");
                            break;
                        case "n":
                            playersScores[i] += 100000;
                            playersInGame--;
                            break;
                    }
                }
                if (currentCardIndex < 36) {
                    currentCardIndex++;
                } else {
                    break exit;
                }
            }
        } while (playersInGame > 0);
    }

    public static void showWinners(String[] players, int[] playersScores) {
        System.out.println("\n============Blackjack results!===========");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + players[i] + " scores: " + (playersScores[i] - 100000));
        }
    }

    public static void showPlayers(String[] players) {
        System.out.println("============Blackjack players:===========");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }

    public static int[] createDeck() {
        int[] deck = new int[36];
        for (int i = 0; i < 36; i++) {
            deck[i] = i;
        }
        return deck;
    }

    public static void shuffleDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int newIndex = (int)(Math.random() * (deck.length - 1));
            int card = deck[i];
            deck[i] = deck[newIndex];
            deck[newIndex] = card;
        }
    }
}
