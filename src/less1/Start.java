package less1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;


public class Start {
    public static void main(String[] args) throws IOException {
        /*testingOverload (5,6);
        testingOverload (0.5,6.3);
        testingOverload ("Gad", "Bark");*/
        //testConsoleInput();
        //testRandom();
        //minMaxIndex();
    }

    static void testingOverload(int a, int b) {
        System.out.println(a + b);
    }

    static void testingOverload(double a, double b) {
        System.out.println(a + b);
    }

    static void testingOverload(String a, String b) {
        System.out.println(a + b);
    }

    static void testingOverload(int a) {
        System.out.println(a + 0);
    }

    static void testingOverload() {
        testingOverload(0);
    }

    static void arr() {
        int[] parr = {1, 2, 3488, 462, 48463211};
        for (int i : parr) {
            System.out.println(i);
        }
    }

    static void testConsoleInput() throws IOException {
        var read = new BufferedReader(new InputStreamReader(System.in));
        String name = read.readLine();
        System.out.println("Hi, " + name);
    }

    public static void testRandom() {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 8) + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void minMaxIndex() {
        int[] arr = {1, 8, 12, 36, 88, -12, 35, 79, -26};
        int min;
        int max;

        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length-1];
        System.out.printf("%3d%n", min);
        System.out.printf("%3d", max);
    }
}

