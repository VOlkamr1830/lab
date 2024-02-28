package lab3;

import java.util.Arrays;

public class Lab3ApplicationRunner {

    private final ArrayInitService arrayInitService;

    public Lab3ApplicationRunner() {
        this.arrayInitService = new ArrayInitService();
    }

    public void run() {
        System.out.println("init 1 arr");
        int[] arr1 = arrayInitService.init();

        System.out.println("init 2 arr");
        int[] arr2 = arrayInitService.init();

        processArrays(arr1, arr2);
    }

    private void processArrays(int[] arr1, int[] arr2) {
        System.out.println("processing arr1: " + Arrays.toString(arr1) + "and arr2: " + Arrays.toString(arr2));
    }

}
