//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
  	//constructors
    public BlackJackCard()
    {
    	super(0, "no suit");
    }
    public BlackJackCard(int f, String s)
    {
    	super(f,s);
    }

  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
    if(Card.FACES[getFace()]=="ZERO")
    	return 0;
    	 if(Card.FACES[getFace()]=="ACE")
    	return 11;
    	 if(Card.FACES[getFace()]=="KING")
    	return 10;
    	 if(Card.FACES[getFace()]=="QUEEN")
    	return 10;
    	 if(Card.FACES[getFace()]=="JACK")
    	return 10;
    	 if(Card.FACES[getFace()]=="TEN")
    	return 10;
    	 if(Card.FACES[getFace()]=="NINE")
    	return 9;
    	 if(Card.FACES[getFace()]=="EIGHT")
    	return 8;
    	 if(Card.FACES[getFace()]=="SEVEN")
    	return 7;
    	 if(Card.FACES[getFace()]=="SIX")
    	return 6;
    	 if(Card.FACES[getFace()]=="FIVE")
    	return 5;
    	 if(Card.FACES[getFace()]=="FOUR")
    	return 4;
    	 if(Card.FACES[getFace()]=="THREE")
    	return 3;
    	 if(Card.FACES[getFace()]=="TWO")
    	return 2;
    	 if(Card.FACES[getFace()]=="ONE")
    	return 1;


		return 0;
  	}
  	
 }