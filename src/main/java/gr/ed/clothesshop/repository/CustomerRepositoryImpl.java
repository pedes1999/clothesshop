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
public class CustomerRepositoryImpl implements CustomerRepository{
    private Customer[] customers = new Customer[20];
    private int position = 0;
    
    //CRUD should be implemented!!!
   

    //Create
    @Override
    public int create(Customer customer) {
        //prwta vazw customer kai meta auksanw to position kata 1
        if(position < 20 ) {
        customers[position++] = customer ;
        }
            return customer.getId();
    }

    
    //Read
    @Override
    public Customer read(int customerId) {
        return null;
 }
    
    //Read Wrong implementation(multiple)
    @Override
    public Customer[] read() {
         Customer[] returnCustomers=new Customer[10];
        int returnPosition = 0;
         for (int i = 0 ; i < position && i<10 ; i++){
           returnCustomers[i] = customers[i];
        }
         return returnCustomers;
    }

    @Override
    public void update(int customerId, String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int customerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
