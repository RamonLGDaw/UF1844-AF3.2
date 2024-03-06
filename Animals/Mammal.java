package Animals;

public abstract class Mammal {

    protected String name;
    protected int age;
    protected static int totalMammals;

    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
        totalMammals++;

    }

    public abstract String makeSound();

    public abstract String giveBirth();

    public abstract String toString();

    public int getTotalMammals(){
        return totalMammals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}