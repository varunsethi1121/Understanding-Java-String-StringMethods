import java.util.*;
public class stringPalindrome {
    public static boolean stringCheck(String str){
        for(int i=0;i<(str.length()/2);i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string you want to check for: ");
            String sampleString = sc.nextLine();
            System.out.print(stringCheck(sampleString));
        }
    }
}
