import java.util.Random;
import java.util.Scanner;

public class numberguessinggame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcom to guessing the number game!!!");
        System.out.println("Guess the number between 0 to 100");
        System.out.println("You have 4 chance to guess the correct number");
        int score=0;
        boolean flag=false, start=true;
       
        
        while(start){
        Random rd=new Random();
        int randnum=rd.nextInt(100);
        
        for(int i=0;i<4;i++){
        System.out.println("Guess the number!");
        int num=sc.nextInt();
            if(num==randnum){
                System.out.println("Your number is right"+num);
                score++;
                flag=true;
                break;
            }
            else if(num>randnum){
                System.out.println("Number is too high than random number");
            }
            else{
                System.out.println("Number is too low than random number");
            }
        }
        if(!flag){
            System.out.println("You lost your chance. The number is:"+randnum);
        }
        System.out.println("Score:"+score);
        System.out.println("Do you want to play again??");
        start=sc.nextBoolean();
        }
    }
}
