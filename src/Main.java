import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            Deck deck = new Deck();
            deck.shuffle();
            boolean running = true;
            while (running) {
                System.out.println("""
                        What would you like to do?
                        1. Print Deck
                        2. Choose a random card to remove
                        3. Quit
                        :\s""");
                int usr_choice = kb.nextInt();
                switch (usr_choice) {
                    case 1:
                        System.out.println(deck);
                        break;
                    case 2:
                        System.out.println(deck.getAndRemoveRandomCard());
                        break;
                    case 3:
                        System.out.println("Goodbye.");
                        running = false;
                        break;
                    default:
                        System.out.println("Incorrect Input.");
                }
            }
        }
    }