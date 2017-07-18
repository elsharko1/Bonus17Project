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

    @Override
    public void play() {
        super.play();
        System.out.println(weaponType);
    }
}
