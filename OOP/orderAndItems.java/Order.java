import java.util.ArrayList;

public class Order {

        private String name;
        // private double total;
        private boolean ready;

        private ArrayList<Item> items;
        
        public Order(){
                this.name = "Guest";
                this.items = new ArrayList<Item>();
        }

        public Order(String name){
                this.name = name;
                this.items = new ArrayList<Item>();
        }
        
        public void addItem(Item item) {
                items.add(item);
        }

        public String getMessage() {
                if(this.ready){
                        return "Your order is ready";
                }
                return "We are waiting on your order";
        }

        public double getOrderTotal(){
                double total = 0;
                for(Item item : items){
                        total += item.getItemPrice();
                }
                return total;
        }

        public String getName(){
                return this.name;
        }

        public void setName(String name){
                this.name = name;
        }

        public boolean getReady(){
                return this.ready;
        }

        public void setReady(boolean ready) {
                this.ready = ready;
        }

        public ArrayList<Item> getItems(){
                return this.items;
        }

        public void setItems(ArrayList<Item> items){
                this.items = items;
        }

}
