package codesoft.Internship;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("marks obtained ");
        System.out.println("enter maths marks");
        int mathMarks=sc.nextInt();
        System.out.println("enter english marks");
        int engMarks=sc.nextInt();
        System.out.println(" enter physics marks");
        int phymarks=sc.nextInt();
        System.out.println("enter chemistry marks ");
        int chemMarks=sc.nextInt();
        System.out.println("enter ss marks");
        int sstMarks=sc.nextInt();
        int maximumMarks=5*100;
        int totalmarks=mathMarks + engMarks + phymarks + chemMarks + sstMarks;
        int averagePercent=totalmarks/5;
        System.out.println("total marks obtained:"+totalmarks);
        System.out.println("Average percent  of the student :"+ averagePercent);
        if(averagePercent>90){
            System.out.println("congratulation u score 'A Grade' ");
        }
        else if(averagePercent<90 && averagePercent>80){
            System.out.println("conratulation u score 'B Grade'");
        }
        else if(averagePercent<80 && averagePercent>70){
            System.out.println("congratulation u score 'C Grade'");
        }
        else if (averagePercent>50 &&averagePercent<70){
            System.out.println("congratulation u score 'D Grade'");
        }
        else if(averagePercent>33 && averagePercent<50){
            System.out.println("congartulation u score 'E Grade'");
        }
        else {
            System.out.println("too bad u got Failed!");
        }


    }
}
