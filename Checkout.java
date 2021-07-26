import java.time.*;
public class Checkout extends Item{
    LocalDateTime checkoutTime;
    LocalDateTime returnTime;
    boolean isCheckedOut;
    Checkout(int itemID, int value){
        super(itemID, value);
        checkoutTime = new LocalDateTime();
        returnTime = new LocalDateTime();
        isCheckedOut = false;
        isRequested = false;
    }
    public boolean isCheckoutItem(){
        return true;
    }

    public boolean isReferenceItem(){
        return false;
    }

    public LocalDateTime getCheckoutTime(){

        return checkoutTime;
    }

    public boolean isCheckedOut(){
        return isCheckedOut;
    }

    public void returnItem(){
        isCheckedOut = false;
        returnTime = LocalDateTime.now();
    }
}