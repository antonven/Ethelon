package myapps.wycoco.com.ethelon.models;

/**
 * Created by dell on 11/26/2016.
 */

public class UnlockableItems {

    private int itemImage;
    private String itemName;
    private String itemPrice;

    public UnlockableItems() {
    }

    public UnlockableItems(int itemImage, String itemName, String itemPrice) {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }
}
