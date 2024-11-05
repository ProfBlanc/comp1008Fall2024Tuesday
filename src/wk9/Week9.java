package wk9;

public class Week9 {

    public static void main(String[] args) {
        Human bruce = new Human("Bruce Wayne", 50, 70);

        System.out.println(bruce);
        System.out.println(bruce.jump());

        SuperHero batman = new SuperHero("Bruce Wayne", 50, 70);
        System.out.println(batman);
        batman.setAge(30);
        System.out.println(batman.jump());
    }
}
