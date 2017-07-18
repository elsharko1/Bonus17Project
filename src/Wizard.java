/**
 * Created by Mark on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {

    int spellNumber = 0;
    //constructor for the method for this class which inherits everything from character class and magic class and adds special powers
    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellNumber = spellNumber;
    }

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }
    //override the play method to add spell number
    @Override
    public void play() {
        super.play();
        System.out.println("Your spell number is: " + spellNumber);
        System.out.println();
    }
}
