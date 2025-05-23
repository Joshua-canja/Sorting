/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting;

/**
 *
 * @author Student's Account
 */
import java.util.Arrays;
import java.util.Scanner;

public class Sorting2 {
    
     public static void main(String[] args) {
    
 String[] name = {
            "Kevin", "Rachel", "Owen", "Jasmin", "Gabriel", "Olivia", "Madison", "Alexander", "Jacob", "Hannah",
            "Penelope", "Sarah", "Isabella", "Quentin", "Emma", "Victor", "Aaron", "Patrick", "Yasmine", "Grace",
            "Steven", "Liam", "Brianna", "Nathan", "William", "Diana", "Leah", "Mathhew", "Abigail", "Joshua",
            "Caleb", "Noah", "Charlotte", "Sophia", "Uriel", "Lucas", "Samuel", "Mia", "Elijah", "Zachary",
            "Tristan", "Zoe", "Alice", "Vanessa", "Thomas", "Katherine", "Benjamin", "Isaac", "Daniel", "Xander"
        };

        // -- METHOD CHOICES --
        /*
           1 = Merge Sort
           2 = Quick Sort
        */ 
        int choice = 1;  // Replace with method choice

        if (choice == 1) {
            mergeSort(name, 0, name.length - 1);
            System.out.println("Merge Sort:");
            System.out.println(" ");
            printDaNames(name);
        } else if (choice == 2) {
            quickSort(name, 0, name.length - 1);
            System.out.println("Quick Sort:");
            System.out.println(" ");
            printDaNames(name);
        } else {
            System.out.println("-- Invalid choice --");
        }
    }

    // --- MERGE SORT --
    public static void mergeSort(String[] name, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(name, left, mid);
            mergeSort(name, mid + 1, right);
            merge(name, left, mid, right);
        }
    }

    public static void merge(String[] name, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        String[] L = new String[n1];
        String[] R = new String[n2];

        for (int i = 0; i < n1; i++)
            L[i] = name[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = name[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                name[k] = L[i];
                i++;
            } else {
                name[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            name[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            name[k] = R[j];
            j++;
            k++;
        }
    }

    // --- QUICK SORT ---
    public static void quickSort(String[] name, int low, int high) {
        if (low < high) {
            int p = split(name, low, high);
            quickSort(name, low, p - 1);
            quickSort(name, p + 1, high);
        }
    }
    
    // 
    public static int split(String[] name, int low, int high) {
        String pivot = name[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (name[j].compareTo(pivot) < 0) {
                i++;
                String temp = name[i];
                name[i] = name[j];
                name[j] = temp;
            }
        }
        String temp = name[i + 1];
        name[i + 1] = name[high];
        name[high] = temp;
        return i + 1;
    }
    
    // --- DISPLAY THE NAMES ---
    public static void printDaNames(String[] name) {
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + "|" + " ");
            if (i != name.length - 1) {
            }
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}