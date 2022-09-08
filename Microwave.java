public class Microwave extends Gadjet {
    private int capacity;

    Microwave() {
        this(0);
    }

    Microwave(int id, int cost, int capacity) {
        super(id, cost);
        this.capacity = capacity;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Weeeeooo");
    }

    @Override
    public void about() {
        super.about();
        System.out.println(this.capacity);
    }
}