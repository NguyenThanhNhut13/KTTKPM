/*
 * @ (#) InvestorObserver.java       1.0     15/03/2025
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

public class InvestorObserver implements Observer {

    private final String investorName;

    public InvestorObserver(String investorName) {
        this.investorName = investorName;
    }

    @Override
    public void update(double price) {
        System.out.println(investorName + " nhận thông báo: Giá cổ phiếu thay đổi -> " + price);
    }
}
