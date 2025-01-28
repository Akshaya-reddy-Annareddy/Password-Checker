import java.util.*;
public class Passwordcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conditions for valid password:\n1. It should contain at least 8 characters\n2. Contain at least one uppercase and one lowercase letter\n3. Contain at least one number\n4. Contain at least one special character");
        System.out.print("Enter your password: ");
        String pw = sc.nextLine();

        String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String spl = "!@#$%^&*(){}[]|\\?/<,>.~";
        boolean upper = false, lower = false, number = false, special = false;
        if(pw.length() < 8){
            System.out.println("It should contain atleast 8 characters");
        }else{
            for(int i=0; i<pw.length(); i++){
                char ch = pw.charAt(i);
                if(cap.indexOf(ch)>=0){
                    upper = true;
                }else if(small.indexOf(ch)>=0){
                    lower = true;
                }else if(num.indexOf(ch)>=0){
                    number = true;
                }else if(spl.indexOf(ch)>=0){
                    special = true;
                }
                if(upper && lower && number && special){
                    break;
                }
            }
        }
       if(upper && lower && number && special){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password"); 
        }
    }
}
