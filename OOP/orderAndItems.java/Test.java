public class Test {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.amountSold = 0;
        item1.price = 2.99;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.amountSold = 0;
        item2.price = 3.99;

        Item item3 = new Item();
        item3.name = "Drip Coffe";
        item3.amountSold = 0;
        item3.price = 2.99;

        Item item4 = new Item();
        item4.name = "Capuccino";
        item4.amountSold = 0;
        item4.price = 5.99;



        Order order1 = new Order();
        order1.name = "Jordan";
        order1.total = 1.99;
        order1.ready = true;
        order1.items.add(item1);

        Order order2 = new Order();
        order2.items.add(item2);
        order2.name = "Jimmy";
        order2.total = item2.price;
        order2.ready = false;

        Order order3 = new Order();
        order3.items.add(item3);
        order3.name = "Noah";
        order3.total = item3.price;
        order3.ready = false;

        Order order4 = new Order();
        order4.items.add(item4);
        order4.items.add(item2);
        order4.items.add(item2);
        order4.name = "Sam";
        order4.total = item4.price;
        order4.ready = false;

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);


    }
}
