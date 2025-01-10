
//CounthowmanytimeslowercasevowelsoccurredinaStringenteredbytheuser
// a e i o u

import java.util.*;
public class stringParacticeQs {
    public static int questionParctice1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                    || str.charAt(i) == 'i') {
                count = count + 1;
            }
        }
        return count;
    }

    public static void questionParctice2(){
        String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi"; 
        System.out.println(str.equals(str1) +" "+str.equals(str2)); //FALSE , TRUE
    }

    public static void questionParctice3(){
        String str="ApnaCollege".replace("l",""); //WILL REPLACE TARGET WITH REPLACEMENT
        System.out.println(str);
    }

        public static void questionParctice4(String str1, String str2) {
            String lowerStr1 = str1.toLowerCase();
            String lowerStr2 = str2.toLowerCase();
            if (lowerStr1.length() != lowerStr2.length()) {
                System.out.println("Not an anagram string");
                return;
            }
            char[] charArray1 = lowerStr1.toCharArray();
            char[] charArray2 = lowerStr2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("Anagram strings");
            } else {
                System.out.println("Not an anagram string");
            }
        }

        public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the string of your choice: ");
            String sampleString1 = sc.nextLine();
            System.out.print("Enter the string of your choice: ");
            String sampleString2 = sc.nextLine();
            System.out.println(questionParctice1(sampleString1));
            questionParctice2();
            questionParctice3();
            questionParctice4(sampleString1, sampleString2);
        }
}
}

