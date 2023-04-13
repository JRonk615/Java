public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("Drip Coffee", 0, 1.99);
        Item item2 = new Item("Capuccino", 0, 2.99);
        Item item3 = new Item("Iced Coffee", 0, 3.99);
        Item item4 = new Item("Mocha", 0, 4.99);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Jordan");
        Order order4 = new Order("Bob");
        Order order5 = new Order("Jilly");
        
        order1.addItem(item2);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item1);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item1);
        order4.addItem(item2);

        order5.addItem(item2);
        order5.addItem(item4);

        System.out.println(order5.getMessage());
        order5.setReady(true);
        System.out.println(order5.getMessage());

        System.out.println(order5.getOrderTotal());




    }
}
