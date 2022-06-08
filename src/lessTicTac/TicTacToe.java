package lessTicTac;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static final int SIZE = 3;

    static final char DOT_EMPTY = '*';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final String SPACE = " ";
    static final char HEADER_FIRST_SYMBOL = '#';

    static final char[][] FIELD = new char[SIZE][SIZE];
    static final Scanner sc = new Scanner(System.in);
    static final Random rnd = new Random();

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        initField();

        printField();
        
        playGame();


    }

    private static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                FIELD[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {

        printHead();

        printBodyField();
    }

    private static void printHead() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE);
        for (int i = 0; i < SIZE; i++) {
            printFieldNumber(i);

        }
        System.out.println();
    }

    private static void printFieldNumber(int i) {
        System.out.print(i + 1 + SPACE);
    }

    private static void printBodyField() {
        for (int i = 0; i < SIZE; i++) {
            printFieldNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(FIELD[i][j] + SPACE);
            }
            System.out.println();
        }
    }

    private static void playGame() {
    
        humanTurn();
        printField();
        
        aiTurn();
        printField();
        
    }

    private static void humanTurn() {
        int rowNumber;
        int columnNumber;
        boolean isInputValid = true;

        System.out.println("Ход человека. Введите номер строки и столбца");
        do {
            rowNumber = -1;
            columnNumber = -1;
            isInputValid = true;

            System.out.println("Номер строки: ");
            if (sc.hasNextInt()) {
                rowNumber= sc.nextInt()-1;
            } else {
                incorrectInput();
                isInputValid = false;
                continue;
            }



        } while (!isInputValid);


    }

    private static void incorrectInput() {
        System.out.println("Ошибка ввода. Введите число в диапозоне поля");
        sc.nextLine();
    }

    private static void aiTurn() {

    }
}
