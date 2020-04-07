/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerassignment;

import java.util.Random;
import observer.Customer;
import observer.Eshop;

/**
 *
 * @author George.Giazitzis
 */
public class ObserverAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eshop fruitShop = new Eshop();
        fill(fruitShop);
        fruitShop.newFruitComing("Mangos");
        fruitShop.newFruitArrived("Apples");
        fruitShop.fruitOutOfStock("Oranges");
        fruitShop.informNewPrice("Lemons");
        fruitShop.advertiseNewPrice("Pears");
    }
    //to fill the observer list faster.Just change the 2 to 500 
    public static void fill(Eshop fruitShop) {
        if (fruitShop.getObservers().isEmpty()) {
            for (int i = 0; i < 2; i++) {
                fruitShop.addObserver(new Customer(randomName(),fruitShop));
            }
        }
    }
    //populate the names with random names to verify prints
    public static String randomName(){
    String[] arr = new String[]{"Nikos","Kyriakos","Xristos","Giwrgos","Xristina","Katerina"};
    return arr[new Random().nextInt(arr.length)];
    }
}
