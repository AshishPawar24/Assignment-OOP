import java.util.Scanner;
public class question_7 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if(x>=90){
        System.out.println("Grade A");
    }
    else if(x<90 && x>=80){
        System.out.println("Grade B");
    }
    else if(x<80 && x>=70){
        System.out.println(" Grade C");
    }
    else if(x<70 && x>=60){
        System.out.println("Grade D");
    }
    else if(x<60 && x>=50){
        System.out.println("Grade E");
    }
    else{
        System.out.println(" Grade F");
    }
    
    }
}
