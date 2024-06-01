import java.util.Scanner;

public class sgc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of subjects:");
        int a=sc.nextInt();
        int[] marks=new int[a];
        System.out.println("Enter Students Marks.");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum + marks[i];
        }
        double avg=(double)sum/marks.length;
        System.out.println("Your Result");
        System.out.println("----------------");
        System.out.println("Total Marks:"+sum);
        System.out.println("Percentage:"+avg);
        System.out.println("YOUR GRADE:");
        System.out.println("----------------");
            if(avg<=35){
                System.out.println("GRADE:FAIL!!!");
            }
            else if(avg<=50){
                System.out.println("GRADE:E");
            }
            else if(avg<=65){
                System.out.println("GRADE:D");
            }
            else if(avg<=75){
                System.out.println("GRADE:C");
            }
            else if(avg<=85){
                System.out.println("GRADE:B");
            }
            else if(avg<=100){
                System.out.println("GRADE:A");
            }
    }
}
