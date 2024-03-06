package Animals;

public class Cat extends Mammal {
    
    private String sound;
    private int litterSize;

    public Cat(String name, int age, String sound, int litterSize) {
        super(name, age);
        this.sound = sound;
        this.litterSize = litterSize;
    }


    @Override
    public String giveBirth() {
        return "This species' average litter size is: " + this.litterSize;
    }

    @Override
    public String makeSound() {
        return "This animal sounds like this: " + this.sound;
    }

    @Override
    public String toString() {
        return "The " + this.name + " is " + this.age + " years old, and sounds like " + getSound();
    }


    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getLitterSize() {
        return litterSize;
    }

    public void setLitterSize(int litterSize) {
        this.litterSize = litterSize;
    }
}
