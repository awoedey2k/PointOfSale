/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author asmith86
 */
public class CashRegister {
    private Customer customer;
    private Product[] products = {
        new Product("ABC24", "Shoes", 24.95, new HolidayDiscount()),
        new Product("DGB56", "Baseball bat", 14.95, new NoDiscount()),
        new Product("TYP!@", "Lamp", 30.99, new HalfOffDiscount())
    };
    
    public CashRegister(){
        
    }
    
    public void addItemToSale(){
        
    }
    
}
