public class Card {
    
    private String pattern; // 무늬
    private String denomination;
    private int point;

    public Card (String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public Card (String pattern, int index) {
        this.pattern = pattern;
        this.denomination = denomination;
        this.point = point;
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

    private int numberToPoint(int number) {
        if (number >= 11) {
            return 10;
        }
        return number;
    }

    private String numberToDenomination(int number) {

        if (number == 1) {
            return "A";
        } else if (number == 11) {
            return "J";
        } else if (number == 12) {
            return "Q";
        } else if (number == 13) {
            return "K";
        }

        return String.valueOf(number);

    }

    public int getPoint() {
        return this.point;
    }
}
