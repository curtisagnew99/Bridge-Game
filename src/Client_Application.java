import java.util.Scanner ;

public class Client_Application
{

    public static void main(String[] args)
    {
        Players [] players = new Players[4] ;
        Card [] deck = Deck.getDeck() ;
        Scanner key = new Scanner(System.in) ;



        System.out.println("Un-Shuffled Deck of Cards");
        Deck.ShowCards(deck);
        Card [] shuffleCards = Deck.Shuffle(deck) ;
        System.out.println("\nShuffled Cards");
        Deck.ShowCards(shuffleCards);

        for (int i = 0 ; i < players.length; i++)
        {
            System.out.println("Enter Name");
            players [i] = new Players(key.nextLine()) ;
        }

        Players [] play = Deck.Deal(players, shuffleCards) ;

        System.out.println("=====================================");

        for (Players player : play)
        {
            System.out.println(player.getName());
            
        }
    }
}
