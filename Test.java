import java.util.ArrayList;
import java.util.Arrays;

public class Test{



public static final String ANSI_RED    = "\u001B[31m";
public static final String ANSI_GREEN  = "\u001B[32m";
public static final String ANSI_RESET  = "\u001B[0m";
public static boolean test = true;

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

public static void main(String[] args) {

  if(test){
    System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"string", "PASSED");
  } else {
    System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"string", "FAILED");


}

}

}
