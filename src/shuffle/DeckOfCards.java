package shuffle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private List<Cards> list;
    Cards [] decks;

    public DeckOfCards(){
        decks = new Cards[52];
        int count = 0;
        for (Cards.Suit suit : Cards.Suit.values()){
            for (Cards.Face face : Cards.Face.values()){
                decks[count] = new Cards(face, suit);
                ++count;
            }
        }
         list = Arrays.asList(decks);
        Collections.shuffle(list);
    }
    
    public void printCards(){
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s", list.get(i));
            if (i % 4 == 0){
                System.out.println();
            }
            
        }
    }
}
