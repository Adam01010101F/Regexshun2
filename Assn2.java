import java.io.*;
import java.util.Scanner;

public class Assn2{
    public static void main (String[] args){
        String fLoc;
        BufferedReader file;
        Scanner cin = new Scanner(System.in);
        if(args.length == 0){
            System.out.print("Enter file location: ");
            fLoc = cin;
        }
        else
            fLoc = args[0];
        file = new BufferedReader(fLoc);
        File dir  =  new File(fLoc);
        String regex = "\\$(\\*)*[1-9](\\d?\\d?,?)*.\\d\\d"; //"$(\\*)*(0|([1-9]\\d*),*)*.\\d{2}";
        // String testString = "$**022,045.67";  
        for (File f : dir.listFiles() ){
            if(testString.matches(regex))
                System.out.println("Match!");
            else
                System.out.println(testString + ": Fail!");
        }
        
        }
}