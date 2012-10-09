/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author asmith86
 */
public class LineItem {
    private int quantity;
    private Product product;
    
    public LineItem(Product product, int quantity){
        this.setProduct(product);
        this.setQuantity(quantity);
     
        
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final Product getProduct() {
        return product;
    }
    

    
    
    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    

    public final int getQuantity() {
        return quantity;
    }
    
    public double calculateSubTotal(){
        return this.product.getPrice() * this.quantity;
    }
    
    public String getLineItemString(){
        String itemString;
        itemString = this.product.getName() + " " + this.product.getProductID() + " " +
                this.product.getPrice() + " " + this.getQuantity() + " " + this.calculateSubTotal();
        return itemString;
        
    }
    
    
    
    
    
    
    
}
