import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TypicalDeck {
	TypicalCard[] deck = new TypicalCard[52];
	// Implementing Fisher–Yates shuffle
	  void shuffleDeck()
	  {
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = deck.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      TypicalCard a = deck[index];
	      deck[index] = deck[i];
	      deck[i] = a;
	    }
	  }

	public void makeDeck()
	{
		String[] suits = {"Clubs","Diamonds", "Hearts", "Spades"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		int counter = 0;
		for(String suit : suits)
		{
			for(String rank : ranks)
			{
				TypicalCard aCard = new TypicalCard(suit, rank);
				deck[counter] = aCard;
				counter++;
			}
		}
	}
}
