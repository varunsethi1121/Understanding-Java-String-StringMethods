import java.util.Arrays;

public class stringLongestPrefix {
    public static void main(String[] args) {
        String sampleStringArray[] = {"flower", "flow", "flight"};
        
        // Print original array
        System.out.println("Original array:");
        for (String s : sampleStringArray) {
            System.out.println(s);
        }
        
        // Sort the array
        Arrays.sort(sampleStringArray);
        System.out.println("\nSorted array:");
        for (String s : sampleStringArray) {
            System.out.println(s);
        }
        
        // Find the longest common prefix
        String prefix = findLongestCommonPrefix(sampleStringArray);
        System.out.println("\nLongest Common Prefix: " + prefix);
    }

    public static String findLongestCommonPrefix(String[] sampleStringArray) {
        // If array is empty, return an empty string
        if (sampleStringArray == null || sampleStringArray.length == 0) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        String startingString = sampleStringArray[0];
        String endingString = sampleStringArray[sampleStringArray.length - 1];
        
        // Compare the first and last strings in the sorted array
        for (int i = 0; i < Math.min(startingString.length(), endingString.length()); i++) {
            if (startingString.charAt(i) != endingString.charAt(i)) {
                return sb.toString();
            }
            sb.append(startingString.charAt(i));
        }
        return sb.toString();
    }
}

