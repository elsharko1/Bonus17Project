import java.util.ArrayList;

/**
 * Created by Mark on 7/17/2017.
 */
public class PlayerProfileApp {
    public static void main(String[] args) {

        ArrayList<GameCharacter> listOfCharacters = new ArrayList<>();
        
        listOfCharacters.add(new Warrior("Mark", 10, 10, "Axe"));
        listOfCharacters.add(new Warrior("Joya", 10,10, "sword"));
        listOfCharacters.add(new Wizard("Antonella", 10,10,10, 10));
        listOfCharacters.add(new Wizard("Mike", 10,10,10, 10));
        listOfCharacters.add(new Wizard("Vernon", 10,10,10, 10));

        for (GameCharacter list: listOfCharacters) {
            list.play();

        }

    }
}
