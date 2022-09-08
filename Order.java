import java.util.Vector;

public class Order {
    private int cost = 0;
    private Vector<Pizza> orderList = new Vector();

    Order() {
        System.out.println("Новый заказ");
    }

    public void chosePizza(String name, String size) {
        Pizza pizza = Pizza.valueOf(name);
        pizza.setSize(size);
        orderList.add(pizza);
        cost += pizza.getCost();
    }

    /*
     * public void removePizza(String name, String size) {
     * Pizza pizza = Pizza.valueOf(name);
     * pizza.setSize(size);
     * 
     * for (int i = 0; i < orderList.size(); i++) {
     * Pizza temp = orderList.get(i);
     * 
     * if (temp == pizza) {
     * orderList.remove(i);
     * System.out.print(temp.getCost());
     * cost -= temp.getCost();
     * }
     * }
     * }
     */

    public void shoppingBasket() {
        for (int i = 0; i < orderList.size(); i++) {
            Pizza temp = orderList.get(i);
            temp.about();

        }
    }

    public void getCost() {
        System.out.println("Стоимость заказа: " + cost);
    }

    public void toCancel() {
        System.out.println("Заказ отменен");
        cost = 0;
        orderList.clear();
    }

}