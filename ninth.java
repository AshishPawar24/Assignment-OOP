public class ninth {
    public static void main(String[] args){
        String s1="NITIN";
        int left_ptr=0;
        int right_ptr=s1.length()-1;
        while(left_ptr<=right_ptr){
            if(s1.charAt(left_ptr)!=s1.charAt(right_ptr)){
                System.out.println("string is not a palindrome");
                return;
            }
                left_ptr++;
                right_ptr--;
                
    }
System.out.println("string is a palindrome");

}
}

