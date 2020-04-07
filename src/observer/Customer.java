/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author George.Giazitzis
 */
public class Customer implements Observer {

    private Observable observable;
    private String name;

    public Customer(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void update(String update) {
        System.out.println("Hello, " + name + "! The e-shop you are following has a new update:");
        System.out.println(update);
    }

    public Observable getObservable() {
        return observable;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

}
