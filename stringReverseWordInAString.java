public class stringReverseWordInAString {
    public static void main(String args[]){
        String s = "Varun Sethi";
        String[] wordsInString = s.split(" ");
        for(int i=wordsInString.length-1;i>=0;i--){
            System.out.print(wordsInString[i] + " ");
        } 
    }
}
