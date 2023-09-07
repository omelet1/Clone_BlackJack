public class Card {
    
    private String pattern; // 무늬
    private String denomination;

    public Card (String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }; // 끗수

    public String getPattern () {
        return pattern;
    }

    public void setPattern (String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString () {
        return "Card{" + " pattern='" + pattern + ", denomination ='" + denomination + '}';
    }
}
