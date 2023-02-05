package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Carter Jeffery Feb 3, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random rand = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(rand.nextInt(13)+ 1);
            card.setSuit(Card.SUITS[rand.nextInt(4)]);
            hand[i] = card;
        //System.out.println(card);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Pick a card value(1-13): ");
        int pickedValue = input.nextInt();
        System.out.print("Pick a suit: ");
        String pickedSuit = input.next();
        Card picked = new Card();
        picked.setValue(pickedValue);
        picked.setSuit(pickedSuit);
        boolean found = false;
        for(int i = 0; i < hand.length; i++){
            if((hand[i].getValue() == picked.getValue()) && hand[i].getSuit().equalsIgnoreCase(picked.getSuit())){
               printInfo();
                found = true;
                break;
            }
        } 
        if(!found){
            System.out.println("Sorry! Card was not found in the random hand!");
        }   
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }
 
}
