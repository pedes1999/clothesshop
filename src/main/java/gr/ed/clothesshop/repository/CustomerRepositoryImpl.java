/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.ed.clothesshop.repository;

import gr.ed.clothesshop.model.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pnbdr
 */
public class CustomerRepositoryImpl implements CustomerRepository {

    private final List<Customer> customers = new ArrayList<>();
    private int index;

    //CRUD should be implemented!!!
    //Create
    @Override
    public int create(Customer customer) {
        //prwta vazw customer kai meta auksanw to position kata 1
        customer.setId(index++);
        customers.add(customer);
        return customer.getId();
    }

    //Read
    @Override
    public Customer read(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;
            }

        }
        return null;
    }

    //Read Wrong implementation(multiple)
    @Override
    public List<Customer> read() {
        return customers;
    }

    @Override
    public void update(int customerId, String email) {
       Customer customer = read(customerId);
       if(customer != null) {
           customer.setEmail(email);
       }
    }

    @Override
    public boolean delete(int customerId) {
        Customer customer = read(customerId);
        if(customer != null ) {
            customers.remove(customer);
             return true;
        }
        return false;
    }
}
