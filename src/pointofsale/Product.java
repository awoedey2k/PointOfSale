/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author asmith86
 */
public class Product {
    private String productID;
    private String name;
    private double price;
    private DiscountStrategy discount;
    
    public Product(String productID, String name, double price, DiscountStrategy discount){
        this.setProductID(productID);
        this.setName(name);
        this.setPrice(price);
        this.setDiscount(discount);
        
    }
            
    public final void setPrice(double price){
        this.price = price;
    }
    
    public final double getPrice(){
        return this.price;
    }
    
    public final void setProductID(String productID){
        this.productID = productID;
        
    }

    public final String getProductID() {
        return productID;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }
    
    
    
    public final void setDiscount(DiscountStrategy discount){
        this.discount = discount;
        
    }
    
    
    
}
