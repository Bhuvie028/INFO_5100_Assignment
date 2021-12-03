/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Organization;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bhuva
 */
public class DeliveryManDirectory {
    
   ArrayList<DeliveryMan> deliveryMan;

   public DeliveryManDirectory(){
        this.deliveryMan = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(ArrayList<DeliveryMan> deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
    public DeliveryMan createDeliveryMan(String name, String username){
    DeliveryMan dm = new DeliveryMan();
    dm.setDeliveryManName(name);
    dm.setDeliveryusername(username);
    deliveryMan.add(dm);
    return dm;
    }
   
    public DeliveryMan findDeliveryMan(String name){
       for(DeliveryMan dm :deliveryMan ){
           if(dm.getDeliveryManName().equals(name)){
               return dm;
           }
       }
       return null;
    }
    public void deleteDeliveryMan(DeliveryMan deliveryman){
       deliveryMan.remove(deliveryman);
    }
   
}

