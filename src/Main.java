public class Main {

    public static void main(String args[]) {
        init();
    }

    public static void init() {
        // Create new deck
        Deck myDeck = new Deck(60, false);

        Card lightning_bolt = new Card("Lightning Bolt", Card.CARD_TYPE.INSTANT, "R", Card.RARITY.COMMON);

        myDeck.addCard(lightning_bolt);

        System.out.println("The current Decklist of 'MyDeck' is: " + myDeck.getDeckList());

    }
}
