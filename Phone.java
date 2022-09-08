public class Phone extends Gadjet {
    private int number;

    Phone() {
        this(123456789);
    }

    Phone(int id, int cost, int number) {
        super(id, cost);
        this.number = number;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Ring ring!");
    }

    @Override
    public void about() {
        super.about();
        System.out.println(this.number);
    }
}