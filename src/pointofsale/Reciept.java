/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author asmith86
 */
public class Reciept {
    private LineItem[] lineItems = new LineItem[1];
    private Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    
    
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }
    
    
    
     private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
     
     public double getTotal() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.calculateSubTotal();
        }
        return grandTotal;
    }
     
     
     
     
    
    
    
    
    
   
    
    
    
     
    
   
    
    
    
    
}
