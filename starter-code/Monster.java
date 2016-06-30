/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    private int health;
    private int damage;

    public Monster(){
        health = 100;
        damage = 0;
    }

    public Monster(int mHealth, int mDamage){
        health = mHealth;
        damage = mDamage;
    }


    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables 

    public void setHealth(int mHealth){
        health = mHealth;
    }
    public int getHealth(){
        return health;
    }

    public void setDamage(int mDamage){
        damage = mDamage;
    }
    public int getDamage(){
        return damage;
    }

    public abstract String aboutMe();
}
