/*
 * @ (#) StockMarket.java       1.0     15/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package observer;
/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 15/03/2025
 * @version:    1.0
 */

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {

    private final ArrayList<Observer> observers;
    private double price;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        if(!observers.contains(obj))
            observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> temp = new ArrayList<>(this.observers);
        temp.forEach(o -> o.update(price));
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
