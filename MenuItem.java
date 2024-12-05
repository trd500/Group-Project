public class MenuItem {
    private int itemID;
    private String itemName;
    private double price;

    public MenuItem(int itemID, String itemName, double price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
    }

    //item ID
    public int getItemID() {
        return itemID;
    }
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    // name
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    //price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // items as a string
    public String getItemDetails() {
        return "Item ID: " + itemID + ", Name: " + itemName + ", Price:" + price;
    }
}
