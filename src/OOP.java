import java.util.ArrayList;

public class OOP {
    public static void main(String[] args) {
        Human benyamin = new Human("Benyamin", 1379);
        Human aref = new Human("Aref", 1381);
        Human sina = new Human("Sina", 1383);
        Human elham = new Human("Elham", 1381);
        benyamin.introduce();
        benyamin.showFriends();
        benyamin.follow(aref);
        benyamin.follow(sina);
        benyamin.showFriends();
        System.out.println();
        System.out.println("Benyamin interest: " + benyamin.findOut());
    }

}

// public, private, package-private

class LivingThing {
    final int birthDate;

    LivingThing(int birthDate) {
        this.birthDate = birthDate;
    }
}

class Animal extends LivingThing {
    Animal(int birthDate) {
        super(birthDate);
    }
}

class Human extends LivingThing {
    String name;
    ArrayList<Human> friends = new ArrayList<>();

    Human(String name, int birthDate) {
        super(birthDate);
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello my name is " + name);
    }

    public void follow(Human toFollow) {
        this.friends.add(toFollow);
    }

    public void showFriends() {
        System.out.println(this.name + "'s friends: ");
        for (Human human : friends) {
            System.out.print(human.name + "   ");
        }
    }

    public int findOut() {
        int t = 0;
        for (Human human : friends) {
            t += human.birthDate;
        }
        t /= friends.size();
        return t;
    }
}
