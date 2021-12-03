/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.menu;

import java.util.ArrayList;

/**
 *
 * @author bhuva
 */
    public class MenuDirectory {
    
    ArrayList<Menu> menu;

    public MenuDirectory(){
        this.menu = new ArrayList<>();
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menu = menu;
    }
     

}
