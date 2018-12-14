import java.util.Scanner;

public class TestTIS_Transaction{


/**
    TestTIS_Main main = new TIS_Main();
    TestTIS_Tickets ticket = new TIS_Tickets();
    static TestMHS_Main bank = new MHS_Main();

    Scanner scan = new Scanner(System.in);
**/
    public String transaction = "-1";
    public double cashAmount = 0;

public String getTransaction(){
  return transaction;
}
public double getCashAmount(){
  return cashAmount;
}

/*

  public static Payment createPayment(String bankaccount, double cashAmount){
    //System.out.println("Please enter bankaccount number: ");
    //String bankaccount = scan.next();
    bankaccount = bankaccount.replace("-", "");
    //System.out.println("Please choose ticket: ");
    //double cashAmount = main.totalTicketPrice(); // skapa rätt adress för att hämta ticketpris
    Payment currentPayment = bank.checkPayment(bankaccount, cashAmount);

    //tester
    // System.out.println(currentPayment.isValid); // gör en retur metod för att kunna få tillbaka om transaktionen gått igenom
    // System.out.println(currentPayment.nameOfBank);
    return currentPayment;
    **/

  }
