import java.util.Scanner;
public class question_23 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
            System.out.print(a);
             a++;
        }
        System.out.println();
    }

    }
   
}

