/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.menu.MenuDirectory;
import java.util.HashMap;

/**
 *
 * @author bhuva
 */
public class Order {
    
    private int orderID;
    HashMap<String, Integer> itemName ;
    String orderStatus;
    UserAccount userAccount;
    Restaurant restaurant;
    MenuDirectory menuDirectory;
    DeliveryMan deliveryMan;
    Double amount;
    String comments;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    private static int count = 1;

    public int getOrderID() {
        return orderID;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public HashMap<String, Integer> getItemName() {
        return itemName;
    }

    public void setItemName(HashMap<String, Integer> itemName) {
        this.itemName = itemName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }
    
    public Order(){
        orderID = count;
        count++;
        orderStatus = "Ordered";
    }
    @Override
    public String toString(){
        return orderStatus;
    }
    
}
