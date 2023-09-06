package ru.bandurina.array2app._main;

import java.util.Scanner;

public class _Main {

    public static void main(String[] args) {
        System.out.println("Enter 4 integers: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];
        int x = array[0] = scanner.nextInt();;
        int y = array[1] = scanner.nextInt();;
        int w = array[2] = scanner.nextInt();;
        int z = array[3] = scanner.nextInt();;

        int i = 0;
        if (x > y) {
            i = x; x = y; y = i;
        }
        else x = x;
        if (y > w) {
            i = y; y = w; w = i;
        }
        else y = y;
        if (w > z) {
            i = w; w = z; z = i;
        }
        else w = w;
        if (x > y) {
            i = x; x = y; y = i;
        }
        else z = z;
        System.out.println("Increasing sequence: " + x + ", " + y + ", " + w + ", " + z);
    }
}