public class Television extends Gadjet {
    int numOfChannels;

    Television(int id, int cost, int numOfChannels) {
        super(id, cost);
        this.numOfChannels = numOfChannels;
    }

    Television() {
        this(0);
    }

    @Override
    public void about() {
        super.about();
        System.out.println(numOfChannels);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Pip!");
    }
}