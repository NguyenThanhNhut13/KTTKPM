package vn.edu.iuh.fit;

import vn.edu.iuh.fit.entity.Product;
import vn.edu.iuh.fit.strategy.ConsumptionTax;
import vn.edu.iuh.fit.strategy.LuxuryTax;
import vn.edu.iuh.fit.strategy.VATTax;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000, new VATTax());
        Product alcohol = new Product("Alcohol", 500, new ConsumptionTax());
        Product luxuryWatch  = new Product("Đồng hồ xa xỉ", 2000, new LuxuryTax());

        laptop.displayInfo();
        alcohol.displayInfo();
        luxuryWatch.displayInfo();
    }
}