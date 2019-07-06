package com.vlada.tasks.finalgrade;

public class FinalGrade {
    public static void main(String[] args) {
        int grade = 60;
        int projects =6;
        int finalGrade = finalGrade(grade,projects);
        System.out.println(finalGrade);


        finalGrade = finalGrade(100, 12);  // 100
        System.out.println(finalGrade);
        finalGrade =  finalGrade(99, 0);    // 100
        System.out.println(finalGrade);
        finalGrade = finalGrade(10, 15);   // 100
        System.out.println(finalGrade);
        finalGrade = finalGrade(85, 5);    // 90
        System.out.println(finalGrade);
        finalGrade = finalGrade(55, 3);    // 75
        System.out.println(finalGrade);
        finalGrade = finalGrade(55, 0);    // 0
        System.out.println(finalGrade);
        finalGrade = finalGrade(20, 2);    // 0
        System.out.println(finalGrade);
    }


    public static int finalGrade(int grade, int numberOfProjects){
        int finalGrade;
        if (grade>90 || numberOfProjects>10){
            finalGrade=100;
        }else if(grade > 75 && numberOfProjects >= 5){
            finalGrade = 90;
        }else if (grade>50 && numberOfProjects >=2){
            finalGrade=75;
        }else {
            finalGrade =0;
        }
        return finalGrade;

    }
}
