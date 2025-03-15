/*
 * @ (#) Subject.java       1.0     15/03/2025
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



public interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}
