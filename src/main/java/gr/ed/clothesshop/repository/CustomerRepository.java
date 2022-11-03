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
public interface CustomerRepository {
    //CRUD
    //Create
    int create(Customer customer);
    //Read Single
    Customer read( int customerId);
    
    //Read multiple
    Customer[] read();
    
    //Update email
    void update(int customerId , String email);
    
   //Delete
    boolean delete(int customerId);
}
