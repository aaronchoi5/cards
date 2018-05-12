
public class TypicalCard implements Card{
	String suit;
	String rank;
	
	public TypicalCard(String givenSuit, String givenRank)
	{
		suit = givenSuit;
		rank = givenRank;
	}
	
	public String returnIdentity()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(this.rank);
		builder.append(" of ");
		builder.append(this.suit);
		return builder.toString();
	}
	
	public void printIdentity()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(this.rank);
		builder.append(" of ");
		builder.append(this.suit);
		System.out.println(builder.toString());
	}
}
