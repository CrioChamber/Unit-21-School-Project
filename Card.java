//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;
    
    public Card( String s, int f)
  	{
  		suit = s;
  		face = f;
  	}

	// modifiers
	public void setFace( int f)
	{
		face = f;
	}

	public void setSuit( String s)
	{
		suit = s;
	}

  	//accessors
	public String getSuit()
	{
		return suit;
	}

	public int getFace()
	{
		return face;
	}

  	public abstract int getValue();

	public boolean equals(Object obj)
	{ 
		Card rhs = (Card) obj;
		if(this.getSuit() == rhs.getSuit() && this.getFace() == rhs.getFace())
			return true;
		return false;
	}

    public String toString()
  	{
  		return FACES[face] + " of " + suit;
  	}
  	//toString
  	
 }