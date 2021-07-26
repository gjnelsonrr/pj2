abstract class User{
    String firstName;
    String lastName;
    String address;
    int phoneNumber;
    int cardNumber;
    User(String fn, String ln, String adr, int phone, int card){
        firstName = fn;
        lastName = ln;
        address = adr;
        phoneNumber = phone;
        cardNumber = card;
        LibraryAccount account = new LibraryAccount(this);
    }

    public abstract boolean isChild();

    public abstract boolean isAdult();
}