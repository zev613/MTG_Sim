public class Artifact extends Card {
    Artifact(String card_name, String mana_cost, RARITY rarity) {
        super(card_name, CARD_TYPE.ARTIFACT, mana_cost, rarity);
    }
}
