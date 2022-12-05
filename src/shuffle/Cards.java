package shuffle;

public class Cards {
    public enum Face{Ace, Deuce, Three, Four, Five, Six,Seven, Eight, Nine, Ten, Jack, Queen, King}
    public enum Suit{Clubs, Diamonds, Hearts, Spades}

    private Face face;
    private Suit suit;

    public Cards(Face face, Suit suit){
        this.face = face;
        this.suit = suit;
    }

    public Face getFace(){
        return face;
    }
    public Suit getSuit(){
        return suit;
    }

    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}
