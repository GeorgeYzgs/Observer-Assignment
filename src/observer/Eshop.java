/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George.Giazitzis
 */
public class Eshop implements Observable {

    private List<Observer> observers = new ArrayList();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        observers.forEach(s -> s.update(message));
    }

    //inform customers of a new fruit about to arrrive to the shop
    public void newFruitComing(String fruit) {
        String notify = "A new fruit: " + fruit + " is coming to our shop";
        notifyObserver(notify);
    }

    //inform customers of a new fruit that has arrived to our shop
    public void newFruitArrived(String fruit) {
        String notify = "A new fruit: " + fruit + " has arrived to our shop";
        notifyObserver(notify);
    }

    //inform customers that a fruit has gone out of stock
    public void fruitOutOfStock(String fruit) {
        String notify = "The fruit: " + fruit + " is currently out of stock in our shop";
        notifyObserver(notify);
    }

    //advertise that a fruit is about to increase in price
    public void advertiseNewPrice(String fruit) {
        String notify = "The fruit: " + fruit + " is about to go up in price in our shop";
        notifyObserver(notify);
    }

    //notify customers of a fruit's new price
    public void informNewPrice(String fruit) {
        String notify = "The fruit: " + fruit + " has gone up in price in our shop";
        notifyObserver(notify);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
