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
import payment.CreditCard;

import java.util.Random;
//imports here
// YOUR CODE HERE
public class Controller {
  public static void main(String[] args) throws InterruptedException{
// create a person variable named john with following info:
// FirstName: John
// LastName: Doe
// Street Address: 1100 Brickell Ave
// Suite Address: Apt 102
// City: Miami
// State: Florida
// YOUR CODE HERE
    Person john = new Person("John", "Doe", "1100 Brickell Ave", "Apt 102", "Miami", "Florida");

// create a Credit Card variable named masterCard with the following info:
// cardHolder: the person that you create above
// Type: MasterCard
// Credit Limit: 2500.00
// YOUR CODE HERE
// create a Credit Card variable named ax with the following info:
// cardHolder: the person that you create above
// Type: American Express
// Credit Limit: 5000.00
// YOUR CODE HERE
    CreditCard masterCard = new CreditCard(john, "MasterCard", 2500.00);
    CreditCard ax = new CreditCard(john, "American Express", 5000.00);
//adding the masterCard to john
john.getCreditCards().add(masterCard);
john.getCreditCards().add(ax);
// add the American Express to the person john
// YOUR CODE HERE
// creating and Item variable named cafeMocha with the following info:
Item cafeMocha = new Item("Food", "Cafe Mocha", 4.77);
// creating and Item variable named gucciSlipper with the following info:
// Cataory: Clothing
// Name: Gucci Princetown
// Price: 2650.00
// YOUR CODE HERE
    Item gucciSlipper = new Item("Clothing", "Gucci Princetown", 2650.00);
// creating and Item variable named coke with the following info:
// Cataory: Food
// Name: Coke
// Price: 1.99
// YOUR CODE HERE
    Item coke = new Item("Food", "Coke", 1.99);
// creating and Item variable named airlinesTicket with the following info:
// Cataory: Travel
// Name: MIA-SFO
// Price: 823.26
// YOUR CODE HERE
    Item airlinesTicket = new Item("Travel", "MIA-SFO", 823.26);
// john is buying cafeMocha using his MasterCard credit card
((CreditCard)john.getCreditCards().get(0)).makeCharge(cafeMocha);
// john is buying gucciSlipper using his MasterCard credit card
// hint this may run into credit limit issues
    ((CreditCard) john.getCreditCards().get(0)).makeCharge(gucciSlipper);
// YOUR CODE HERE
// john is buying gucciSlipper using his American Express credit card
    ((CreditCard) john.getCreditCards().get(1)).makeCharge(gucciSlipper);
// YOUR CODE HERE
// john is running a transaction Report on his MasterCard
((CreditCard)john.getCreditCards().get(0)).transactionsReport();
// john is running a transaction Report on his American Express
    ((CreditCard)john.getCreditCards().get(1)).transactionsReport();
// YOUR CODE HERE
    Random generator = new Random();
// buying 7 cafeMocha using different credit cards
    for(int i=1; i<=7; i++){
// DO NOT MESS WITH THE SLEEP CODE
// sleep for a random time upto 1 seconds
      Thread.sleep(generator.nextInt(1001));
// buy cafeMocha on MasterCard if the cafeMocha is a multiple 3
// else buy it on the AX card
// example
// i = 1 -> Buy it on the AX
// i = 2 -> Buy it on the AX
// i = 3 -> Buy it on the MasterCard
// i = 4 -> Buy it on the AX
// ...
// hint use if else statement
// YOUR CODE HERE
    }//end for
// buying 5 airlinesTicket using different credit cards
    for(int i=1; i<=5; i++){
// DO NOT MESS WITH THE SLEEP CODE
// sleep for a random time upto 1 seconds
      Thread.sleep(generator.nextInt(1001));
// buy airlinesTicket on MasterCard if i is even
// else buy it on the AX card
// hint use if else statement
// YOUR CODE HERE
    }//end for
// buying 10 cokes using different credit cards
    for(int i=1; i<=10; i++){
// sleep for a random time upto 1 seconds
      Thread.sleep(generator.nextInt(1001));
// this is use to randomly select a credit card
      int randomSelectCard = generator.nextInt(2);
// if randomSelectCard is 0 use the MasterCard
// if this is the case print out "randomSelectCard: MasterCard"
// if randomSelectCard is 1 use the American Express
// if this is the case print out "randomSelectCard: MasterCard"
// hint use if else statement
// YOUR CODE HERE
    }//end for
// john is running a transaction Report on his masterCard
// YOUR CODE HERE
// john is running a transaction Report on his American Express
// YOUR CODE HERE
// john is running displayInfo method
// YOUR CODE HERE
  }//end main
}//end class