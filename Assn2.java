public class Assn2{
    String fLoc;
    public static void main (String[] args){
        // if(args.isEmpty()){
        //     System.out.print("Enter file location: ");
        //     System.in(fLoc);
        // else
        //     fLoc = args[0];
        //File dir  =  new File(args[0]);
        String regex = "\\$(\\*)*[1-9](\\d?\\d?,?)*.\\d\\d"; //"$(\\*)*(0|([1-9]\\d*),*)*.\\d{2}";
        //Can't acccept 0 hundreds place
        String testString = "$**22,45.67";  
        if(testString.matches(regex))
            System.out.println("Match!");
        else
            System.out.println(testString + ": Fail!");
        
        //For (File f : )
    }
}