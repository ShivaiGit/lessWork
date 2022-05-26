package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 9);
        Scanner scr = new Scanner(System.in);

        int userNumber;
        int count;
        for (count = 0; count < 3; count++) {
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
        System.out.println("Повторить игру еще раз? (1 – повторить, 0 – нет) - ");
        int reload = scr.nextInt();
    }
}