import java.util.ArrayList;

/**
 * Created by Mark on 7/17/2017.
 */
public class PlayerProfileApp {
    public static void main(String[] args) {

        ArrayList<GameCharacter> listOfCharacters = new ArrayList<>();
        //added an ArrayList with all my players
        listOfCharacters.add(new Warrior("Mark", 10, 10, "Axe"));
        listOfCharacters.add(new Warrior("Greg", 10,10, "Sword"));
        listOfCharacters.add(new Wizard("Athena", 10,8,7, 5));
        listOfCharacters.add(new Wizard("Denise", 4,3,6, 9));
        listOfCharacters.add(new Wizard("April", 1,-1,10, 2));

        //ran a foreach to go through and print the arrayList
        for (GameCharacter list: listOfCharacters) {
            list.play();

        }

    }
}
