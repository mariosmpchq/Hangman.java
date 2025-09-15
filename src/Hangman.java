import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        // List of words
        String[] words = {"java","ergasia", "hangman", "simple", "game", "computer"};
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];
        char[] guessed = new char[word.length()];
        Arrays.fill(guessed, '_');
        int attempts = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");

        while (attempts > 0 && new String(guessed).contains("_")) {
            System.out.println("\nWord: " + String.valueOf(guessed).replace("", " ").trim());
            System.out.println("Attempts left: " + attempts);
            System.out.print("Guess a letter: ");
            String input = sc.nextLine().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Please enter a single letter.");
                continue;
            }

            char guess = input.charAt(0);
            boolean correct = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessed[i] = guess;
                    correct = true;
                }
            }

            if (!correct) {
                attempts--;
                System.out.println("Wrong guess!");
            }
        }

        if (new String(guessed).contains("_")) {
            System.out.println("\nYou lose! The word was: " + word);
        } else {
            System.out.println("\nYou win! The word was: " + word);
        }

        sc.close();
    }
}
