public class stringMethods {
    public static void main(String args[]){
        String sampleString = new String(" Hey! How are you ? ");
        String sampleAnotherString = new String("Hey! How Are You ?");
        System.out.println("1"+sampleString);
        System.out.println("2"+sampleString.length());
        System.out.println("3"+sampleString.trim());
        System.out.println("4"+sampleString.length());
        System.out.println("5"+sampleString.charAt(7));
        System.out.println("6"+sampleString.equalsIgnoreCase(sampleAnotherString));
        System.out.println("7"+sampleString.compareTo(sampleAnotherString));
        System.out.println("8"+sampleString.compareToIgnoreCase(sampleAnotherString));
        System.out.println("9"+sampleString.concat(" Varun"));
        System.out.println("10"+sampleString);
        System.out.println("11"+sampleString.replace("V", "v"));
        System.out.println("12"+sampleString.substring(7));
        System.out.println("13"+sampleString.substring(7, 14));
        System.out.println("14"+sampleString.toLowerCase());
        System.out.println("15"+sampleString.toUpperCase());
        // System.out.println("16"+ sampleString.toCharArray());
    }
}
