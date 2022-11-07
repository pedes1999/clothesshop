package gr.ed.clothesshop.services;

import gr.ed.clothesshop.model.Customer;
import gr.ed.clothesshop.model.Order;
import gr.ed.clothesshop.model.Product;
import gr.ed.clothesshop.repository.CustomerRepository;
import gr.ed.clothesshop.repository.ProductRepository;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }
    
    
    @Override
    public boolean register(Customer customer) {
        customerRepository.create(customer);
        return true;
    }

    @Override
    public boolean placeOrder(int customerId, int productId, int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Product> searchProduct(String productName) {
        return productRepository.read();
    }

    @Override
    public Order showOrderint(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void printCustomers() {
       List<Customer> customers =  customerRepository.read();
       for (Customer customer:customers){
           System.out.println(customer);
       }
    }
    
}
