/*
 * @ (#) StockMarketObserverTest.java       1.0     15/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 15/03/2025
 * @version:    1.0
 */

import observer.InvestorObserver;
import observer.Observer;
import observer.StockMarket;

public class StockMarketObserverTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer investor1 = new InvestorObserver("Nhà đầu tư A");
        Observer investor2 = new InvestorObserver("Nhà đầu tư B");

        stockMarket.register(investor1);
        stockMarket.register(investor2);

        stockMarket.setPrice(100.5);
        stockMarket.setPrice(200.5);
    }
}
