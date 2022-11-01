/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.ed.clothesshop.model;

import gr.ed.clothesshop.enums.CustomerCategory;
import java.util.Date;

/**
 *
 * @author pnbdr
 */
public class Customer extends Person{
    private Date registrationDate;
    private double balance;
    private CustomerCategory customerCategory;

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCategory() {
        return customerCategory.toString();
    }

    public void setCategory(CustomerCategory Category) {
        this.customerCategory = Category;
    }
    
    
    
}
