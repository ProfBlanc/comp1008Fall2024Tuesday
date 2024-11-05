package wk9;

public class SuperHero extends Human{

    /*
            how many instance vairables does SuperHero
            have DIRECT access to from Human?
                2

            how many instance vairables does SuperHero
            have access either directly or indirectly?
                3

            how many methods (special and non-special)
            does SuperHero have access to?

     */
    String heroName, power, weakness;
    double strength;

    public SuperHero(){}
    public SuperHero(String name, int age, double height){
        super(name, age, height);

    }

    public SuperHero(String name, int age, double height,
                     String heroName, String power, String weakness, double strength){

        super(name, age, height);
        this.heroName = heroName;
        this.power = power;
        this.weakness = weakness;
        this.strength = strength;

    }

    @Override
    public String toString(){

        //return  "SuperHero" + super.toString().substring(5);
        String result =  super.toString().replace("Human", "SuperHero");
        result = result.replace("}", ",");
        result += String.format("heroName=%s, power=%s, weakness=%s, strength=%.1f",
                heroName, power, weakness, strength);
        return result;
    }

    @Override
    public String jump(){
        return super.jump().replace(name, heroName);
    }
    public String jump(String person){
        return heroName + " is jumping over " + person;
    }
    public String fight(String enemy){

        return heroName + " is fighting " + enemy;
    }



}
