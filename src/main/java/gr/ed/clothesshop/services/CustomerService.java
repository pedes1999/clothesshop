/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.ed.clothesshop.services;

import gr.ed.clothesshop.model.Customer;
import gr.ed.clothesshop.model.Order;
import gr.ed.clothesshop.model.Product;
import java.util.List;

/**
 *
 * @author pnbdr
 */
public interface CustomerService {
    
    boolean register(Customer customer);
    
    boolean placeOrder(int customerId,int productId , int orderId);
    
    Product[] searchProduct(String productName);
    
    Order showOrderint(int orderId);
    
    void printCustomers();
}
