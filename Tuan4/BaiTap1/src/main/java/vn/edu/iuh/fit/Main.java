package vn.edu.iuh.fit;

import vn.edu.iuh.fit.entity.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1001);
        System.out.println("State: "+ order.getStateName());
        order.processOrder();
        System.out.println("State: "+ order.getStateName());
        order.processOrder();
        System.out.println("State: "+ order.getStateName());
        order.cancel();
        System.out.println("State: "+ order.getStateName());


        System.out.println("---------------------------");
        Order order2 = new Order(1002);
        System.out.println("State: "+ order2.getStateName());
        order2.processOrder();
        System.out.println("State: "+ order2.getStateName());
        order2.cancel();
        System.out.println("State: "+ order2.getStateName());
        order2.processOrder();
        System.out.println("State: "+ order2.getStateName());
    }
}