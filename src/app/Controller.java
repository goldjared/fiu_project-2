//=============================================================================
// PROGRAMMER: Your name
// PANTHER ID: Your panther ID
//
// CLASS: COP2210
// SECTION: Your class section: example U01
// SEMESTER: The current semester: example Fall 2018
// CLASSTIME: Your COP2210 course meeting time :example T/TH 9:00-10:15 am
//
// Project: Put what this project is: example Lab 5 or Project 1
// DUE:
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
// own and that none of it is the work of any other person.
//=============================================================================

package app;
import client.Person;
import goods.Item;
import payment.CreditCard;
import java.util.Random;
public class Controller {
  public static void main(String[] args) throws InterruptedException{

    Person john = new Person("John", "Doe", "1100 Brickell Ave", "Apt 102", "Miami", "Florida");
    CreditCard masterCard = new CreditCard(john, "MasterCard", 2500.00);
    CreditCard ax = new CreditCard(john, "American Express", 5000.00);
john.getCreditCards().add(masterCard);
john.getCreditCards().add(ax);

Item cafeMocha = new Item("Food", "Cafe Mocha", 4.77);
Item gucciSlipper = new Item("Clothing", "Gucci Princetown", 2650.00);
Item coke = new Item("Food", "Coke", 1.99);
Item airlinesTicket = new Item("Travel", "MIA-SFO", 823.26);
((CreditCard)john.getCreditCards().get(0)).makeCharge(cafeMocha);
((CreditCard) john.getCreditCards().get(0)).makeCharge(gucciSlipper);
((CreditCard) john.getCreditCards().get(1)).makeCharge(gucciSlipper);
((CreditCard)john.getCreditCards().get(0)).transactionsReport();
((CreditCard)john.getCreditCards().get(1)).transactionsReport();
Random generator = new Random();
    for(int i=1; i<=7; i++){
      Thread.sleep(generator.nextInt(1001));
      if(i%3==0) {
        ((CreditCard) john.getCreditCards().get(0)).makeCharge(cafeMocha);
      } else {
        ((CreditCard) john.getCreditCards().get(1)).makeCharge(cafeMocha);
      }
    }
    for(int i=1; i<=5; i++){
      Thread.sleep(generator.nextInt(1001));
     if(i % 2 ==0)  {
       ((CreditCard) john.getCreditCards().get(0)).makeCharge(airlinesTicket);
     } else {
       ((CreditCard) john.getCreditCards().get(1)).makeCharge(airlinesTicket);
     }
    }
    for(int i=1; i<=10; i++){
      Thread.sleep(generator.nextInt(1001));
      int randomSelectCard = generator.nextInt(2);
      if(randomSelectCard == 0) {

        System.out.println("randomSelectCard: MasterCard");
        ((CreditCard) john.getCreditCards().get(0)).makeCharge(coke);
      } else if(randomSelectCard == 1) {

        System.out.println("randomSelectCard: American Express");
        ((CreditCard) john.getCreditCards().get(1)).makeCharge(coke);
      }
    }
    ((CreditCard) john.getCreditCards().get(0)).transactionsReport();
    ((CreditCard) john.getCreditCards().get(1)).transactionsReport();
    john.displayInfo();
  }
}