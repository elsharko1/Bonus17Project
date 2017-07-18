/**
 * Created by Mark on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter {

    int magicalEnergy = 0;


    //constructor for the method for this class which inherits ev erything from character class and adds special powers
    public MagicUsingCharacter(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;


    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }
    //override the play method to add magic stuff
    @Override
    public void play() {
        super.play();
        System.out.println("Your magical energy is: " + magicalEnergy);


    }

}
