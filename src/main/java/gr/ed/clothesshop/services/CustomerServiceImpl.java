package gr.ed.clothesshop.services;

import gr.ed.clothesshop.model.Customer;
import gr.ed.clothesshop.model.Order;
import gr.ed.clothesshop.model.Product;
import gr.ed.clothesshop.repository.CustomerRepositoryImpl;
import gr.ed.clothesshop.repository.ProductRepository;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
    private ProductRepository productRepository = new ProductRepository();
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
    public Product[] searchProduct(String productName) {
        return productRepository.searchProduct(productName);
    }

    @Override
    public Order showOrderint(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void printCustomers() {
       Customer[] customers =  customerRepository.read();
       for (Customer customer:customers){
           System.out.println(customer);
       }
    }
    
}
