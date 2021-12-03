/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bhuva
 */
public class Person extends House{
    protected String name;
    protected int age;    
/*    protected String address;
    protected String community;
    protected String City;

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
*/    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
        
/*
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/
    @Override
    public String toString(){
      return name; 
    }
}

