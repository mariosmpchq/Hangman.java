# Hangman Game (ASCII Version) – Java

## Project Structure

```
HangmanProject/
├─ src/
│  └─ Hangman.java        # The main Java file for the ASCII Hangman game
├─ words.txt               # A simple text file containing the words (one per line)
└─ README.md               # This file, giving you all the instructions you need
```

## About This Game

Welcome to a **fun and simple ASCII Hangman game** built in Java! The game picks a random word from `words.txt`, and your job is to guess it one letter at a time. Every wrong guess draws a part of the hangman, so watch out! The game keeps track of letters you've already guessed and lets you play again as many times as you like.

## Getting Started

1. Clone or download the project into IntelliJ or your preferred Java IDE.
2. Make sure `words.txt` is in the project root (at the same level as `src`). For example:

   ```
   HangmanProject/
   ├─ src/
   │  └─ Hangman.java
   ├─ words.txt
   ```
3. Fill `words.txt` with words you want the game to use, one word per line. Example:

   ```
   apple
   banana
   cat
   dog
   tree
   ```
4. Open `Hangman.java` in IntelliJ.
5. Run the program and start guessing!

## How to Play

* The game shows the hidden word as underscores `_ _ _`.
* Type **one letter at a time** and press Enter.
* Correct letters appear in their proper spots.
* Each wrong guess draws a part of the ASCII hangman.
* The game ends when you guess the word or the hangman is fully drawn.
* After the game ends, you can choose to play again.

## Cool Features

* Picks **random words** from your `words.txt` file.
* **ASCII hangman graphics** update with each wrong guess.
* Keeps track of **letters you’ve already tried**.
* You can **replay the game** as many times as you like.
* Simple **input validation** ensures you only enter one letter at a time.

## Notes

* Make sure `words.txt` is readable by the program.
* You can add or remove words in `words.txt` anytime.
* If the file is missing or unreadable, the game will use a small default word list to keep things running.

Have fun and happy guessing!
