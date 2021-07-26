abstract class Item{
    int itemID;
    int value;
    Item(int itemID, int value){
        this.itemID = itemID;
        this.value = value;
    }

    public abstract boolean isCheckoutItem();

    public abstract boolean isReferenceItem();
}