package circus.animal;

public abstract class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }

    public abstract int getValue();

    public String speak() {
        return "tweet tweet";
    }
}
