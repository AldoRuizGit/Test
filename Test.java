import java.util.ArrayList;
import java.util.Arrays;

public class Test{



public static final String ANSI_RED    = "\u001B[31m";
public static final String ANSI_GREEN  = "\u001B[32m";
public static final String ANSI_RESET  = "\u001B[0m";
public static boolean test = true;
public static boolean test1 = true;

public static TestTIS_Transaction testTrans = new TestTIS_Transaction();



public static ArrayList<String> testTicketName =
        new ArrayList<String>(Arrays.asList(
                "Barn",
                "Ung vuxen",
                "Vuxen",
                "Senior",
                "Familj"));


public static boolean testMetod  (){
  for(int i=0; i < testTicketName.size(); i++){
  test = (TestTIS_Tickets.ticketName.get(i) == testTicketName.get(i));
   if (test == false) {
     break;
   }
  }
  return test;
}

public static ArrayList<String> testTicketDescription =
        new ArrayList<String>(Arrays.asList(
                "För personer mellan 1 och 10 år.",
                "För personer mellan 11 och 17 år.",
                "För personer mellan 18 och 64 år.",
                "För personer 64 år eller äldre.",
                "För en grupp av 1-2 vuxna/seniorer och 1-3 barn."));


public static boolean test2Metod  (){
  for(int i=0; i < testTicketDescription.size(); i++){
  test = (TestTIS_Tickets.ticketDescription.get(i) == testTicketDescription.get(i));
   if (test == false) {
   break;
     }
     }
   return test;
     }

public static ArrayList<Double> testTicketPrice =
  new ArrayList<Double>(Arrays.asList(
                                10.00,
                                15.50,
                                22.50,
                                15.00,
                                40.50));


public static boolean test3Metod  (){
 for(int i=0; i < testTicketPrice.size(); i++){
 test = (TestTIS_Tickets.ticketPrice.get(i) == testTicketPrice.get(i));
 if (test == false) {
  break;
         }
          }
          return test;
          }




  private static boolean testTransaction(){
  String testing = testTrans.getTransaction();
    if ("-1" == testing){
        return true;
                }
              return false;
              }








private static boolean testCashAmount(){
double testinng = testTrans.getCashAmount();
  if (0 == testinng){
    return true;
         }
    return false;

    }






public static void main(String[] args) {
  if(test){
    System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"ArrayList ticketName", "  PASSED");
  } else {
    System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"ArrayList ticketName", "  FAILED");
}


if(test){
  System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"ArrayList ticketDescription", "  PASSED");
} else {
  System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"ArrayList ticketDescription", "  FAILED");
}

if(test){
  System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"ArrayList ticketPrice", "  PASSED");
} else {
  System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"ArrayList ticketPrice", "  FAILED");
}


if(testTransaction()){
  System.out.println("testTransaction " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
}else{
  System.out.println("testTransaction " + ANSI_RED + "FAILED"+ ANSI_RESET);
}


//nya tester

if(testCashAmount()){
  System.out.println("testCashAmount " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
}else{
  System.out.println("testCashAmount " + ANSI_RED + "FAILED"+ ANSI_RESET);
}
}
}
