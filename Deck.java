//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
    for(int i = 0; i <= SUITS.length;i++)
    for (int rank = 1; rank <= NUMFACES; rank++){
        stackOfCards.add(new Card());
		shuffle();
	  }
	}

   public void shuffle ()
	{
		Random random = new Random();
		for(int position = 0; position < stackOfCards.size(); position++){
			Card temp = stackOfCards(position);
			int rand = random(stackOfCards.size());
		}
		//shuffle the deck
		//reset variables as needed
	}

   //accessors
	public int  size ()
	{
		return 0;
	}

	public int numCardsLeft()
	{
		return 0;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}