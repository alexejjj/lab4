package com.company;

import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите длину массива: ");

        int arsize = input.nextInt();
        int array[] = new int[arsize];
        int arr2[] = null;

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < arsize; i++) {
            array[i] = input.nextInt();

        }

        System.out.print("Введённые элементы массива:");

        for (int i = 0; i < arsize; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        System.out.print("Введите число X, элементы равные ему будут удалены из массива: ");
        int x = input.nextInt();

        input.close();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == x) {
                arr2 = new int[array.length - 1];
                for (int index = 0; index < i; index++) {
                    arr2[index] = array[index];
                }
                for (int j = i; j < array.length - 1; j++) {
                    arr2[j] = array[j + 1];
                }
            }
        }
        System.out.println("Оригинальный массив: "+Arrays.toString(array));

        System.out.println("Новый массив после удаления элемента "+x+": "+ Arrays.toString(arr2));
    }
}
