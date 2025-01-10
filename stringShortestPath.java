import java.util.*;
public class stringShortestPath {
    public static void sortestPath(String str){
        int xInitial=0;
        int yInitial=0;
        int yFinal=0;
        int xFinal=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                yFinal = yFinal + 1;
            }
            else if(str.charAt(i)=='S'){
                yFinal = yFinal - 1;
            }
            else if(str.charAt(i)=='E'){
                xFinal = xFinal + 1;
            }
            else if (str.charAt(i)=='W'){
                xFinal = xFinal - 1;
            }
            else{
                System.out.print("Invalid Direction!!");
            }
        }
        int shortestDistance = (int) Math.sqrt(Math.pow((xFinal-xInitial),2)+Math.pow((yFinal-yInitial),2));
        System.out.print("The shortest distance according to the path provided is: " + shortestDistance);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the path: ");
            String samplePath = sc.nextLine();
            sortestPath(samplePath);
        }
    }
}
