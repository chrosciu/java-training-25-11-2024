package eu.chrost.javatraining.day5.lectures.abstracts;

public class Dog extends Animal implements Huggable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getVoice() {
        return "Woof!";
    }

    @Override
    protected String getSpecies() {
        return "dog";
    }

    @Override
    public void hug() {
        System.out.println("Nothing is better than hug a dog :)");
    }
}
