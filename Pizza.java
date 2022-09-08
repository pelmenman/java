public enum Pizza {
    MARGARITA("Маргарита", sizeOfPizza.MEDIUM, 599),
    PEPPERONI("Пепперони", sizeOfPizza.MEDIUM, 669),
    MEAT("Мясная", sizeOfPizza.MEDIUM, 739);

    private String name = "Null";
    protected int cost = 0;
    private sizeOfPizza size = sizeOfPizza.MEDIUM;

    Pizza(String name, sizeOfPizza size, int cost) {
        this.name = name;
        this.size = size;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void about() {
        System.out.println(this.name + " " + this.size.getSize());
    }

    public void setSize(String newSize) {
        sizeOfPizza size = sizeOfPizza.valueOf(newSize);
        this.size = size;
        this.cost = size.setCost(cost);
    }

}