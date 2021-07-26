import java.util.*;
public class LibrarySystem{
    ArrayList<User> userList = new ArrayList<User>();
    ArrayList<Item> itemList = new ArrayList<Item>();
    ArrayList<Request> requestList = new ArrayList<Request>();
    ArrayList<Item> requestedItem = new ArrayList<Item>();
    ArrayList<Renew> renewList = new ArrayList<Renew>();

    public void addUser(User newUser){
        userList.add(newUser);
    }

    public void addItem(Item newItem){
        itemList.add(newItem);
    }

    public static void main(String args[]){

    }
}