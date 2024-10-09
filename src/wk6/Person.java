package wk6;

public class Person {
    private String name;
    private int age;

    public Person(){
        name = "John Doe";
        age = 1;
    }
    public Person(String name, int age) throws Exception {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if(name.length() > 5 && (
                        name.toLowerCase().contains("a")
                        ||
                        name.toLowerCase().contains("e")
                        ||
                        name.toLowerCase().contains("i")
                        ||
                        name.toLowerCase().contains("o")
                        ||
                        name.toLowerCase().contains("u")
        ) ){
            this.name = name;
        }
        else{
            throw new Exception("Invalid name: " + name);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
