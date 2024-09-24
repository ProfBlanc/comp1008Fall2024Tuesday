package wk4;

import java.util.ArrayList;

public class SuperHero {

    private String heroName = "Hero", disguisedName = "Person";
    private double strengthLevel = 80;

    enum Planets {EARTH, PLATO, SILENCE}
    public Planets planet = Planets.EARTH;

    public final String fatalFlaw;

   ArrayList<String> enemies = new ArrayList<>();
    ArrayList<String> allies = new ArrayList<>();

    public String getEnemy(int position){
        if(position < 1 || position > enemies.size()){
            System.out.println("Invalid position");
            return null;
        }
        return enemies.get(position - 1);
    }
    //do the same for ally

    public String run(String towards){
        return String.format("%s is running towards %s", heroName, towards);
    }

    public static SuperHero Villain(String name){
        return new SuperHero("Villain", "Ordinary Person", 99, "heroic activity");
    }
    public SuperHero(){
        fatalFlaw = "Vegetables";
    }

    public SuperHero(String heroName, String disguisedName, double strengthLevel, Planets planet, String fatalFlaw) {
        this.heroName = heroName;
        this.disguisedName = disguisedName;
        this.strengthLevel = strengthLevel;
        this.planet = planet;
        this.fatalFlaw = fatalFlaw;
    }

    public SuperHero(String heroName, String disguisedName, double strengthLevel, String fatalFlaw) {
        this.heroName = heroName;
        this.disguisedName = disguisedName;
        this.strengthLevel = strengthLevel;
        this.fatalFlaw = fatalFlaw;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        if(heroName.length() >= 4)
            this.heroName = heroName;
    }

    public String getDisguisedName() {
        return disguisedName;
    }

    public void setDisguisedName(String disguisedName) {
        if(disguisedName.length() >= 10)
            this.disguisedName = disguisedName;
    }

    public double getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(double strengthLevel) {
        if(strengthLevel >= 80)
            this.strengthLevel = strengthLevel;
    }
}
