/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.ed.clothesshop.repository;

import gr.ed.clothesshop.model.Product;
import java.util.List;

/**
 *
 * @author pnbdr
 */
public interface ProductRepository {
   //CRUD
    //Create
    int create(Product product);
    //Read Single
    Product read( int productId);
    
    //Read multiple
    List<Product> read();
    
    //Update email
    void update(int productId , double price);
    
   //Delete
    boolean delete(int productId);
}
