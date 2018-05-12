
public class Main {

	public static void main(String[] args)
	{
		TypicalDeck deck = new TypicalDeck();
		deck.makeDeck();
		for(TypicalCard card : deck.deck)
		{
			card.printIdentity();
		}
		int counter = 0;
		deck.shuffleDeck();
		for(TypicalCard card : deck.deck)
		{
			card.printIdentity();
			System.out.println(counter);
			counter++;
		}
	}
}
