import java.util.Scanner;
public class question_6 {
    public static void main(String[] args){
    System.out.println("enter a year: ");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if(x%4==0 && (x%100!=0 || x%400==0)){
        System.out.println(x + " is a leap year.");
    }
    else{
        System.out.println(x + " is not a leap year.");
    }
    }
}