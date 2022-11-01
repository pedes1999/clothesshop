/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gr.ed.clothesshop;

import gr.ed.clothesshop.model.Customer;
import gr.ed.clothesshop.model.Product;
import gr.ed.clothesshop.services.CustomerService;
import gr.ed.clothesshop.services.CustomerServiceImpl;

/**
 *
 * @author pnbdr
 */
public class Clothesshop {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Perikis");
        customer.setId(1);
        customer.setEmail("periklis@mail.com");
        
        
        CustomerService customerService = new CustomerServiceImpl();
        customerService.register(customer);
        
        customerService.printCustomers();
        System.out.println("----------------------------------");
        Product[] products = customerService.searchProduct("suit");
        for(Product product:products){
        if (product!=null)  System.out.println(product.getId() + " " + product.getName());
        }
    }
}
