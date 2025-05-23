/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sorting;

/**
 *
 * @author Student's Account
 */
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        String[] name = {
            "Diana", "Elijah", "Aaron", "Joshua", "Noah", "Steven", "Thomas", "Olivia", "Katherine", "Emma",
            "Abigail", "Alexander", "Kevin", "Owen", "Tristan", "Uriel", "Patrick", "Leah", "Gabriel", "Alice",
            "Grace", "Benjamin", "Liahm", "Penelope", "Vannessa", "Victor", "Quentin", "Lucas", "Hanna", "Brianna",
            "Caleb", "Isaac", "Madison", "Rachel", "William", "Xander", "Samuel", "Matthew", "Isabella", "Charlotte",
            "Jacob", "Mia", "Sarah", "Yasmine", "Zachary", "Sopia", "Nathan", "Daniel", "Zoe", "Jasmine"};

        int choice = 1;

        switch (choice) {
            // >>>>> Print Bubble Sort <<<<<<
            case 1 -> { 
                bubbleSort(name);
                System.out.println("Bubble Sort:");
                System.out.println(" ");
                printName(name);
            }
            // >>>>>> Print Selection Sort <<<<< 
            case 2 -> {
                selectionSort(name);
                System.out.println("Selection Sort:");
                System.out.println(" ");
                printName(name);
            }
            // >>>>>> Print Insertion Sort <<<<<
            case 3 -> {
                insertionSort(name);
                System.out.println("Selection Sort:");
                System.out.println(" ");
                printName(name);
            }
        }
    }

    // >>>>> Method for Bubble Sort <<<<<
    public static void bubbleSort(String[] name) {
        int n = name.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    // >>>>> Method for Selection Sort <<<<<
    public static void selectionSort(String[] name) {
        int n = name.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (name[j].compareTo(name[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            String temp = name[minIdx];
            name[minIdx] = name[i];
            name[i] = temp;
        }
    }

    // >>>>> Method for Insertion Sort <<<<<
    public static void insertionSort(String[] name) {
        int n = name.length;
        for (int i = 1; i < n; i++) {
            String key = name[i];
            int j = i - 1;
            while (j >= 0 && name[j].compareTo(key) > 0) {
                name[j + 1] = name[j];
                j--;
            }
            name[j + 1] = key;
        }
    }

        // >>>>> Method for Printing <<<<<
    public static void printName(String[] name) {
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + "|" + " ");

            if ((i + 1) % 10 == 0 && i != name.length - 1) {
                System.out.print("\n    ");
            }
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
