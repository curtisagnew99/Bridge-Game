import java.util.Random ;

public class Deck implements deckInterface
{
    private static Card[] deck = new Card[52] ;

    static Card[] getDeck()
    {
        int cardsUsed = 0 ;

        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for (String s: SUITS) {
            for (String r:  RANKS)
            {
                Card card = new Card(s,r) ;
                deck[cardsUsed] = card;
                cardsUsed++ ;
            }
        }
        return deck ;
    }

    static void ShowCards(Card[] deck)
    {
        int counter = 0 ;
        for (Card card: deck)
        {
            System.out.printf("%s of %s \t", card.rank, card.suit) ;
            counter++ ;

            if (counter%4 == 0)
            {
                System.out.println();
            }
        }
    }

    static Card[] Shuffle(Card[] deck)
    {
        Random rand = new Random() ;
        int j ;
        for (int i = 0 ; i < deck.length ; i++)
        {
            j = rand.nextInt(deck.length) ;
            Card temp = deck[i] ;
            deck[i] = deck[j] ;
            deck[j] = temp ;
        }
        return deck ;

    }

    static Players []  Deal(Players[] players, Card[] deck)
    {
        int cardsPerPerson = 13 ;

        for(int i = 0 ; i < deck.length; i++)
        {
            int position = i % cardsPerPerson ;
            players[i % players.length].getCard(deck[i], position);
        }
        return players ;
    }
}
