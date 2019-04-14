public class Deck {
    private Card[] decklist = {};
    private int num_of_cards = 60;
    private Boolean singleton = false;
    private String deckName;

    public Deck(int num_of_cards) {
        this.num_of_cards = num_of_cards;
        this.deckName = "My Deck";
    }

    public Deck(int num_of_cards, boolean singleton) {
        this.num_of_cards = num_of_cards;
        this.singleton = singleton;
        if(singleton == true) {
            System.out.println("This deck is singleton.");
        }
        else {
            System.out.println("This deck is NOT singleton.");
        }
        this.decklist = new Card[1];
    }

    public void addCard(Card newCard) {
        this.decklist[0] = newCard;
    }

    public void addCards(Card[] newCards) {
        for(int i = 0; i < newCards.length; i++) {
            this.decklist[this.decklist.length + i] = newCards[i];
        }
    }

    public String getDeckList() {
        String decklist_temp = "";
        for (int i = 0; i < this.decklist.length; i++) {
            decklist_temp = this.decklist[i].toString() + ",\n";
        }
        return decklist_temp;
    }

    public Integer getNumOfCards() {
        return this.num_of_cards;
    }

    public void setDeckName(String newDeckName) {
        this.deckName = newDeckName;
    }
}
