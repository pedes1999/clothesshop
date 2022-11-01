package gr.ed.clothesshop.services;

import gr.ed.clothesshop.model.Customer;
import gr.ed.clothesshop.model.Order;
import gr.ed.clothesshop.model.Product;
import gr.ed.clothesshop.repository.CustomerRepository;
import gr.ed.clothesshop.repository.ProductRepository;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pnbdr
 */
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();
    private ProductRepository productRepository = new ProductRepository();
    @Override
    public boolean register(Customer customer) {
        customerRepository.insertCustomer(customer);
        return true;
    }

    @Override
    public boolean placeOrder(int customerId, int productId, int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Product[] searchProduct(String productName) {
        return productRepository.searchProduct(productName);
    }

    @Override
    public Order showOrderint(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void printCustomers() {
        customerRepository.printCustomer();
    }
    
}
