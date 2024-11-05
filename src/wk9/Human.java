package wk9;

public class Human {

    public String name;
    private int age;
    double height;

    public Human() {}

    public Human(String name, int age, double height) {
        this.name = name;
        setAge(age);
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 100)
            this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public String jump(){

        return name + " is jumping at a height of " + (height / 2);
    }

}
