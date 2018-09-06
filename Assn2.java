public class Assn2{
    public static void main (String[] args){
        //File dir  =  new File("a2_input");
        String regex = "\\$(\\*)*([1-9]\\d?\\d?,?)*.\\d\\d"; //"$(\\*)*(0|([1-9]\\d*),*)*.\\d{2}";
        //Can't acccept 0 hundreds place
        String testString = "$**2,345.67";  
        if(testString.matches(regex))
            System.out.println("Match!");
        else
            System.out.println("Fail!");
        
        //For (File f : )
    }
}