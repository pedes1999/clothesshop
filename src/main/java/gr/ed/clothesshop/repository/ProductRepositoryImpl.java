/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.ed.clothesshop.repository;

import gr.ed.clothesshop.model.Product;
import gr.ed.clothesshop.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pnbdr
 */
public class ProductRepositoryImpl implements ProductRepository {
    
   
    private final List<Product> products = new ArrayList<>();
    private int index;

    //CRUD should be implemented!!!
    //Create
    @Override
    public int create(Product product) {
        //prwta vazw product kai meta auksanw to position kata 1
        product.setId(index++);
        products.add(product);
        return product.getId();
    }

    //Read
    @Override
    public Product read(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }

        }
        return null;
    }

    //Read Wrong implementation(multiple)
    @Override
    public List<Product> read() {
        return products;
    }

    @Override
    public void update(int productId, double price) {
       Product product = read(productId);
       if(product != null) {
           product.setPrice(price);
       }
    }

    @Override
    public boolean delete(int productId) {
        Product product = read(productId);
        if(product != null ) {
            products.remove(product);
             return true;
        }
        return false;
    }
    
}
