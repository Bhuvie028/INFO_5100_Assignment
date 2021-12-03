/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.menu.MenuDirectory;
import Business.Organization;
import Business.EcoSystem;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
/**
 *
 * @author bhuva
 */
public class Restaurant {
    String name;
    String address;
    String type;
    String manager;
    MenuDirectory md;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public MenuDirectory getMd() {
        return md;
    }

    public void setMd(MenuDirectory md) {
        this.md = md;
    }
    @Override
    public String toString(){
        return name;
    }
}
