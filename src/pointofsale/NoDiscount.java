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
    private Product product;
    
   public NoDiscount(Product product){
        this.product = product;
    }
    
    @Override
    public double calculateDiscount(){
        return this.product.getPrice() * this.RATE;
        
    }
    
    public double getDiscountPrice(){
        return  this.product.getPrice() - this.calculateDiscount();
    }
    
    
    
}
