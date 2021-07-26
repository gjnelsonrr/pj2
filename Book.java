public class Book extends Checkout{
    boolean isBestSeller;
    LocalDateTime returnDate;
    Book(int itemID, int value){
        super(itemID, value);
        isBestSeller = false;
    }

    public void checkOutItem(){
        isCheckedOut = true;
        checkoutTime = LocalDateTime.now();
        if(isBestSeller == true){
            returnDate = checkoutTime.plus(2, ChronoUnit.WEEKS);
        }
        else{
            returnDate = checkoutTime.plus(3, ChronoUnit.WEEKS);
        }
    }

    public LocalDateTime getReturnDate(){
        return returnDate;
    }

    public void setBestSeller(boolean bestSeller){
        isBestSeller = bestSeller;
    }



}