package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 9);
        Scanner scr = new Scanner(System.in);

        int userNumber;

        for (int i = 0; i < 3; i++) {
            System.out.println("Угадайте цифру от 0 до 9. У вас три попытки - ");
            userNumber = scr.nextInt();
            if (userNumber < randomNumber) {
                System.out.println("Введенная цифра меньше загаданной. Введите цифру - ");
            } else if (userNumber > randomNumber) {
                System.out.println("Введенная цифра больше загаданной. Введите цифру - ");
            } else {
                System.out.println("Вы выиграли");
            }
        }
    }
}
