public class Players
{
    private String name;
    private Card[] cards = new Card[13];

    Players(String Name)
    {
        name = Name ;
    }

    void getCard(Card card, int position)
    {
        cards[position] = card ;
    }

    String getName()
    {
        return name ;
    }

}
