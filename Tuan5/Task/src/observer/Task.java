/*
 * @ (#) Task.java       1.0     15/03/2025
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

public class Task implements Subject {

    private String status;
    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        if (!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> temp = new ArrayList<>(observers);
        for (Observer observer : temp) {
            observer.update(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
