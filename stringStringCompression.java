import java.util.*;
public class stringStringCompression {
    public static void stringCompression(String str){
        StringBuilder sb = new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        System.out.print(sb);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string that you want to compress: ");
            String sampleString = sc.nextLine();
            stringCompression(sampleString);
        }
    }
}
