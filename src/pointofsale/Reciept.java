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
    private LineItem lineItem;
    

    public Reciept(LineItem lineItem){
        
    }

    public void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public LineItem getLineItem() {
        return lineItem;
    }
    
    
}
