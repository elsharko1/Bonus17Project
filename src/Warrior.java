/**
 * Created by Mark on 7/17/2017.
 */
public class Warrior extends GameCharacter{

    String weaponType = "";

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }
    //override the play method to add a weapon type
    @Override
    public void play() {
        super.play();
        System.out.println("Weapon type is: " + weaponType);
        System.out.println();
    }
}
