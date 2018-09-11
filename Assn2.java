import java.io.*;
import java.util.Scanner;

//Known Bug: Currently Accepts ',' anywhere before '.'

public class Assn2{
    public static void main (String[] args){
        String fLoc;
        File file;
        BufferedReader reader = null;
        Scanner cin = new Scanner(System.in);
            try{
            if(args.length == 0){
                System.out.print("Enter file location: ");
                fLoc = cin.nextLine();
            }
            else
                fLoc = args[0];
            reader = new BufferedReader(new FileReader(fLoc));
            String regex = "\\$(\\*)*(([1-9](\\d|\\d{2})?(,\\d{3})*)|0)\\.\\d{2}"; //"$(\\*)*(0|([1-9]\\d*),*)*.\\d{2}";
            while (reader.ready()){
                String target = reader.readLine();
                System.out.print(target+": ");
                if(target.matches(regex))
                    System.out.println("Match!");
                else
                    System.out.println("Fail!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                reader.close();
            }catch(Exception e){e.printStackTrace();}
        }
        }
}