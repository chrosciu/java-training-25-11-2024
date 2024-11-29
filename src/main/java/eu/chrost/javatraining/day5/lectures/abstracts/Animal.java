package eu.chrost.javatraining.day5.lectures.abstracts;

public abstract class Animal implements Printable {
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getVoice();

    @Override
    public String print() {
        return "This is " + getSpecies() + " with name " + name;
    }

    protected abstract String getSpecies();
}
