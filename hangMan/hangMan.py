
# Name:  Masis V. A.
# Hangman Game
# -----------------------------------)
import random
import string

WORDLIST_FILENAME = "words.txt"


def load_words():
    print("Loading word list from file...")
    # inFile: file
    inFile = open(WORDLIST_FILENAME, 'r')
    # line: string
    line = inFile.readline()
    # wordlist: list of strings
    wordlist = line.split()
    print("  ", len(wordlist), "words loaded.")
    return wordlist


def choose_word(wordlist):
    return random.choice(wordlist)

wordlist = load_words()     #global variable for convinience


def is_word_guessed(secret_word, letters_guessed):
    for letter in secret_word:
        if not letter in letters_guessed:
            return False
    return True



def get_guessed_word(secret_word, letters_guessed):
    string=""
    for letter in secret_word:
        if letter in letters_guessed:
            string+=letter
        else:
            string+="_ "
    return string


def get_available_letters(letters_guessed):
    available="abcdefghijklmnopqrstuvwxyz"
    string=""
    for letter in available:
        if not letter in letters_guessed:
            string+=letter
    return string

def hangman(secret_word):
    print("The word contains", len(secret_word), "letters")
    print("_____________________")
    guess=6
    letters=""
    righGuessed=""
    while guess>0 and not is_word_guessed(secret_word,letters):
        print(guess, "guesses left")
        print("available letters are",get_available_letters(letters))
        guessed=input("Please enter a lowercase alphabet")
        if guessed in secret_word:
            righGuessed += guessed
            if is_word_guessed(secret_word, righGuessed):
                print("You win!")
                break
            print("Good guess")

            print(get_guessed_word(secret_word,righGuessed))
        else:
            guess -= 1
            if(guess==0):
                print("Game Over You Lose")
                break
            print("secret word does not contain letter \"", guessed,"\"")
            print(get_guessed_word(secret_word, righGuessed))

        letters+=guessed
        print("__________________________")

    
# -----------------------------------

if __name__ == "__main__":

    secret_word = choose_word(wordlist)
    # print(secret_word) eger cevabi onceden gorup calisiyor mu diye bakmak istersen
    hangman(secret_word)


