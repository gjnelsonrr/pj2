public class LibraryAccount{
    User user;
    ArrayList<Checkout> checkedOutList = new ArrayList<Checkout>();
    LibraryAccount(User user){
        this.user = user;
    }
    void checkoutItem(Checkout item){
        checkedOutList.add(item);
        item.checkOutItem();

    }
    void returnItem(Checkout item){
        checkedOutList.remove(item);
        item.returnItem();
    }

    boolean renewItem(Checkout item){
        if(requestedItem.contains(item)){
            return false;
        }
        else{
            Renew renew = new Renew(item, this);
            if(renew.isRenewable()){
                return true;
            }
            else{
                return false;
            }
        }
    }

    void requestItem(Checkout item){
        if(item.isCheckedOut()){
            Request request = new Request(item, this);
        }
        else{
            checkoutItem(item);
        }

    }
}