/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.ed.clothesshop.repository;

import gr.ed.clothesshop.model.Customer;

/**
 *
 * @author pnbdr
 */
public class CustomerRepository {
    private Customer[] customers = new Customer[20];
    private int position = 0;
    
    //CRUD should be implemented!!!!
    
    //Create
    public void insertCustomer(Customer customer){
        //prwta vazw customer kai meta auksanw to position kata 1
        if(position < 20 ) {
        customers[position++] = customer ;
        }
    }
    
    
    //Read
    public void printCustomer(){
        for (int i = 0 ; i < position ; i++){
            System.out.println(customers[i].getName() + " " + customers[i].getEmail());
        }
    }
}
