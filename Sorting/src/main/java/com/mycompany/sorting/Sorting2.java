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
                "Diana", "Elijah", "Aaron", "Joshua", "Noah", "Steven", "Thomas", "Olivia", "Katherine", "Emma",
                "Abigail", "Alexander", "Kevin", "Owen", "Tristan", "Uriel", "Patrick", "Leah", "Gabriel", "Alice",
                "Grace", "Benjamin", "Liahm", "Penelope", "Vannessa", "Victor", "Quentin", "Lucas", "Hanna", "Brianna",
                "Caleb", "Isaac", "Madison", "Rachel", "William", "Xander", "Samuel", "Matthew", "Isabella", "Charlotte",
                "Jacob", "Mia", "Sarah", "Yasmine", "Zachary", "Sopia", "Nathan", "Daniel", "Zoe", "Jasmine" };
            
            
    
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