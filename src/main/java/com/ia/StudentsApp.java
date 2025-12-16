package com.ia;

import java.util.Arrays;

public class StudentsApp {

    public static void main(String[] args) {

        // 1. Stud array
        String[] students = {
                "Alice", "Bob", "Charlie", "David", "Eva", "Frank",
                "Grace", "Hannah", "Ivan", "Julia", "Kevin", "Laura"
        };

        // 2. 10 stud
        System.out.println("10 stud:");
        for (int i = 0; i < students.length; i++) {
            if(i < 10){
                System.out.println(students[i]);
            }

        }

        // 3. Where is Alice ?
        String searchQuery = "Alice";
        boolean found = false; // This is out flag

        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(searchQuery)) {
                System.out.println("We  found: " + students[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found. Please don‘t cry 😊");
        }

        // 4. Create 2D array for students grades
        // Index in students array = index in grades array
        int[][] grades = {
                {5, 6, 7},   // Alice
                {5, 4, 3},   // Bob
                {5, 1, 5},   // Charlie
                {3, 2, 7},   // David
                {4, 5, 3},   // Eva
                {2, 1, 1},   // Frank
                {1, 4, 3},   // Grace
                {5, 6, 7},   // Hannah
                {6, 7, 2},   // Ivan
                {3, 2, 5},   // Julia
                {5, 6, 7},   // Kevin
                {3, 4, 5}    // Laura
        };

        // 5.Students and averages
        double[] averages = new double[students.length];

        System.out.println("Students aand averages results:");
        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            for (int grade : grades[i]) {
                sum += grade;
            }
            averages[i] = (double) sum / grades[i].length; //casting
            System.out.println(students[i] + " - Average: " + averages[i]);
        }

        // 6. Best of the best
        System.out.println("Top 3 students:");

        for (int i = 0; i < 3; i++) {
            int bestIndex = i;

            for (int j = i + 1; j < averages.length; j++) {
                if (averages[j] > averages[bestIndex]) {
                    bestIndex = j;
                }
            }

            // Swap averages
            double tempAvg = averages[i];
            averages[i] = averages[bestIndex];
            averages[bestIndex] = tempAvg;

            // Swap student names
            String tempName = students[i];
            students[i] = students[bestIndex];
            students[bestIndex] = tempName;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + students[i] + " - Average: " + averages[i]);
        }
    }
}
