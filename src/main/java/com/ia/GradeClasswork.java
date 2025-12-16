package com.ia;

public class GradeClasswork {

    public static void main(String[] args) {
        int[] MARK = new int[30];
        String[] GRADE = new String[30];

        MARK[0] = 85;
        MARK[1] = 62;
        MARK[2] = 40;
        MARK[3] = 12;

        for (int i = 0; i < 30; i++) {
            int m = MARK[i];

            if (m >= 80) {
                GRADE[i] = "Distinction";
            } else if (m >= 60) {
                GRADE[i] = "Merit";
            } else if (m >= 40) {
                GRADE[i] = "Pass";
            } else {
                GRADE[i] = "Fail";
            }
        }

       //Display grades
        for (int i = 0; i < 4; i++) {
            System.out.println(MARK[i] + " -> " + GRADE[i]);
        }
    }
}
