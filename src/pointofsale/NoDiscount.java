/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author asmith86
 */
public class NoDiscount implements DiscountStrategy {
    private final double RATE = 0.0;
 
    
   
    
   @Override
    public double calculateDiscount(Product product){
        return product.getPrice() * this.RATE;
        
    }
    
    public double getDiscountedPrice(Product product){
        return product.getPrice() - this.calculateDiscount(product);
    }
    
    
    
}
