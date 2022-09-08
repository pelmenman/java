public enum sizeOfPizza {
    SMALL("25 см", 50), MEDIUM("30 см", 100), LARGE("35 см", 120);

    private String size = "Null";
    private double coefficient = 0;

    sizeOfPizza(String size, double coefficient) {
        this.size = size;
        this.coefficient = coefficient;
    }

    public int setCost(int cost) {
        return (int) (cost * this.coefficient) / 100;
    }

    public String getSize() {
        return size;
    }

}