/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        Monster[] monsters = new Monster[2];
        Dragon mDragon = new Dragon(3,8);
        Zombie mZombie = new Zombie(4,10);
        monsters[0] = mDragon;
        monsters[1] = mZombie;

        //TODO: Loop through the array of Monsters, printing out something for each Monster

        for(Monster monster: monsters){
            System.out.println(monster.aboutMe());
        }

    }
}
