package Animals;
public class Whale extends Mammal {
    private String sound;
    private int litterSize;
    private int weight;

    public Whale(String name, int age, String sound, int litterSize, int weight) {
        super(name, age);
        this.sound = sound;
        this.litterSize = litterSize;
        this.weight = weight;
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
    public String toString(){
        return "The " + this.name + " whale is " +this.age+ " years old, and its weight is " + this.weight +" kg.";
    };

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
