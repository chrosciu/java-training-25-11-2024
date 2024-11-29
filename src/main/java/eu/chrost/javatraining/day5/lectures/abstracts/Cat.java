package eu.chrost.javatraining.day5.lectures.abstracts;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getVoice() {
        return "Meow!";
    }

    @Override
    protected String getSpecies() {
        return "cat";
    }

    @Override
    public String printWithUpperCase() {
        return super.printWithUpperCase() + "!!!!";
    }
}
