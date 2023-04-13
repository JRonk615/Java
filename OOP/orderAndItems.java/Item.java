public class Item {
    private String name;
    private int amountSold;
    private double price;

    public Item(String itemName, int itemAmountSold, double itemPrice){
        this.name = itemName;
        this.amountSold = itemAmountSold;
        this.price = itemPrice;
    }

    public String getItemName() {
        return this.name;
    }

    public void setItemName(String name){
        this.name = name;
    }

    public double getItemPrice(){
        return this.price;
    }

    public void setItemPrice(double price) {
        this.price= price;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amount) {
        this.amountSold = amount;
    }
}
