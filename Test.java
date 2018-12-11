import java.util.ArrayList;
import java.util.Arrays;

public class Test{

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



}

}
