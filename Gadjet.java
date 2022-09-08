public class Gadjet {
    private int ID;
    private int cost;

    Gadjet() {
        this(00000000, 0);
    }

    Gadjet(int id, int cost) {
        this.ID = id;
        this.cost = cost;
    }

    public void turnOn() {
        System.out.println("It's on!");
    }

    public void about() {
        System.out.print(this.ID + " " + this.cost + " ");
    }
}