package codesoft.Internship;
import java.util.Random;
import java.util.Scanner;
class game{
 public int inputNumber;
    public int randomNumber;
   public int noOfGusses=0;
   public void setNoOfGusses(int noOfGusses){
       this.noOfGusses= noOfGusses;
   }
   public int getNoOfGusses(){
       return noOfGusses;
   }
   public void TakeRandomNumber(){
       Random rand=new Random();
       randomNumber=rand.nextInt(100);
   }
   public void TakeuserInput(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter user input ");
       inputNumber=sc.nextInt();
   }
   public boolean isCorrectNumber(){
       noOfGusses++;
       if(inputNumber==randomNumber){
           System.out.println("Congratulation! ur guess is right:"+inputNumber);
           System.out.println("no. of attempts that u hv take "+noOfGusses);
       }
       else if(inputNumber>randomNumber) {
           System.out.println("too high");
       }
       else if(inputNumber<randomNumber){
           System.out.println("too low");
       }
       return false;
   }

}

public class Task1 {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b){
            g.TakeuserInput();
            b=g.isCorrectNumber();
        }
    }
}
