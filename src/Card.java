public class Card {
    public enum RARITY {
        BASIC_LAND, COMMON, UNCOMMON, RARE, MYTHIC;
    }

    public enum CARD_TYPE {
        LAND, CREATURE, INSTANT, SORCERY, ARTIFACT,  ENCHANTMENT, PLANESWALKER;
    }
    public enum COLOR_IDENTITY {
        WHITE, BLUE, BLACK, RED, GREEN, COLORLESS, MULTI_COLOR;
    }

    public enum MANA_TYPE {
        W, U, B, R, G, C;
    }

    private String card_name;
    private CARD_TYPE card_type;
    private String mana_cost;
    private RARITY card_rarity;
    private COLOR_IDENTITY[] color_identity;
    private COLOR_IDENTITY[] color_identity_temp;
    private Integer cmc;
    private String super_type;
    private String[] sub_types;
    private String[] ability_keywords;
    private String oracle_text;
    private String flavor_text;
    private String card_set;
    private String card_art;
    private String artist_name;
    private Integer collectors_number;

    Card(String card_name, CARD_TYPE type, String mana_cost, RARITY rarity) {
        this.card_name = card_name;
        this.card_type = type;
        this.mana_cost = mana_cost;
        this.card_rarity = rarity;

        String[] temp_cost = mana_cost.split("");
        this.color_identity_temp = new COLOR_IDENTITY[0];
        this.cmc = 0;

        for(int i = 0; i < temp_cost.length; i++) {
            Boolean temp_colorless = false;
            switch(temp_cost[i]) {
                case "W":
                    this.color_identity = add(color_identity_temp, COLOR_IDENTITY.WHITE);
                    break;

                case "U":
                    this.color_identity = add(color_identity_temp, COLOR_IDENTITY.WHITE);
                    break;

                case "B":
                    this.color_identity = add(color_identity_temp, COLOR_IDENTITY.WHITE);
                    break;

                case "R":
                    this.color_identity = add(color_identity_temp, COLOR_IDENTITY.WHITE);
                    break;

                case "G":
                    this.color_identity = add(color_identity_temp, COLOR_IDENTITY.WHITE);
                    break;

                default:
                    temp_colorless = true;
                    break;
            }
            if(temp_colorless == true) {
                this.cmc += Integer.parseInt(temp_cost[i]);
            }
            else {
                this.cmc += 1;
            }
        }

        if (this.color_identity == null) {
            this.color_identity = add(color_identity_temp, COLOR_IDENTITY.WHITE);
            System.out.println("This card's Color Identity is: " + this.color_identity[0].toString());
        }
        else {
            System.out.println("This card's Color Identity is: " + this.color_identity[0].toString());
        }
    }

    public String getCardName() {
        return this.card_name;
    }

    public String getManaCost() {
        return this.mana_cost;
    }

    public String getCardType() {
        return this.card_type.toString();
    }

    public String getCMC() {
        return this.cmc.toString();
    }

    public String getCardSet() {
        return this.card_set;
    }

    public String getSuperType() {
        return this.super_type;
    }

    public String getOracle_Text() {
        return this.oracle_text;
    }

    public String getFlavorText() {
        return this.flavor_text;
    }

    public String getArtistName() {
        return this.artist_name;
    }

    public void setCardName(String newCardName) {
        this.card_name = newCardName;
    }

    public void setCardType(CARD_TYPE newCardType) {
        this.card_type = newCardType;
    }

    public void setManaCost(String newManaCost) {
        this.mana_cost = newManaCost;
    }

    public void setSubTypes(String[] newSubTypes) {
        this.sub_types = newSubTypes;
    }

    public static COLOR_IDENTITY[] add(COLOR_IDENTITY[] arr, COLOR_IDENTITY... elements){
        COLOR_IDENTITY[] tempArr = new COLOR_IDENTITY[arr.length+elements.length];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);

        for(int i=0; i < elements.length; i++)
            tempArr[arr.length+i] = elements[i];
        return tempArr;
    }

    @Override
    public String toString() {
        return this.card_name;
    }
}
