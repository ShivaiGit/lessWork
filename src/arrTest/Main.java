package arrTest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        randomArr();
    }
    static void randomArr() {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 16);
        }
        int[] arr1 = new int[arr.length * 2];
        System.arraycopy(arr,0,arr1,0,15);
        int indexArr = 0;
        for (int i = 15; i < arr1.length; i++) {
            arr1[i] = arr[indexArr] * 2;
            indexArr++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
