import java.io.*;
import java.util.Scanner;

public class Assn2{
    public static void main (String[] args){
        String fLoc;
        File file;
        BufferedReader reader;
        Scanner cin = new Scanner(System.in);
            try{
            if(args.length == 0){
                System.out.print("Enter file location: ");
                fLoc = cin.nextLine();
            }
            else
                fLoc = args[0];
            reader = new BufferedReader(new FileReader(fLoc));
            String regex = "\\$(\\*)*(([1-9](\\d?\\d?,?)*)|0).\\d\\d"; //"$(\\*)*(0|([1-9]\\d*),*)*.\\d{2}";
            // String testString = "$**022,045.67"; 
            while (reader.ready()){
                if(reader.readLine().matches(regex))
                    System.out.println("Match!");
                else
                    System.out.println("Fail!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }   

        
        }
}