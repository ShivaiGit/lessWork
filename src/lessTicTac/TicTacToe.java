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
        System.out.println();
    }

    private static void playGame() {

        humanTurn();
        printField();
        checkEnd();


        aiTurn();
        printField();
        checkEnd();

    }

    private static void humanTurn() {
        int rowNumber;
        int columnNumber;
        boolean isInputValid = true;

        System.out.println("Ход человека. Введите координаты номер строки и стобца.");
        do {
            rowNumber = -1;
            columnNumber = -1;
            isInputValid = true;

            System.out.println("Введите номер строки: ");
            if (sc.hasNextInt()) {
                rowNumber = sc.nextInt() - 1;
            } else {
                incorrectInput();
                isInputValid = false;
                continue;
            }

            System.out.println("Введите номер столбца: ");
            if (sc.hasNextInt()) {
                columnNumber = sc.nextInt() - 1;
            } else {
                incorrectInput();
                isInputValid = false;
            }

        } while (!(isInputValid && isHumanTurnValid(rowNumber, columnNumber)));
        FIELD[rowNumber][columnNumber] = DOT_HUMAN;

    }

    private static void incorrectInput() {
        System.out.println("Ошибка ввода. Введите номер в рамках игрового поля.");
        sc.nextLine();
    }

    private static boolean isHumanTurnValid(int rowNumber, int columnNumber) {

        if (!isNumberValid(rowNumber, columnNumber)) {
            System.out.println("Проверьте введенное значение ");
            return false;

        } else if (!isCellFull(rowNumber, columnNumber)) {
            System.out.println("Вы выбрали занятую ячейку");
            return false;
        }
        return true;
    }

    private static boolean isNumberValid(int rowNumber, int columnNumber) {
        return !(rowNumber >= SIZE || rowNumber < 0 || columnNumber >= SIZE || columnNumber < 0);

    }

    private static boolean isCellFull(int rowNumber, int columnNumber) {
        return FIELD[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void checkEnd() {

        checkWin();

        checkMapFull();

    }

    private static void checkWin() {

    }

    private static void checkMapFull() {

    }

    private static void aiTurn() {
        int rowNumber;
        int columnNumber;
        System.out.println("Ход компьютера");
        do {
            rowNumber = rnd.nextInt(SIZE);
            columnNumber = rnd.nextInt(SIZE);
        } while (!isCellFull(rowNumber, columnNumber));

        FIELD[rowNumber][columnNumber] = DOT_AI;
        System.out.println("Компьютер пошёл: " + rowNumber + "-" + columnNumber);
    }
}
