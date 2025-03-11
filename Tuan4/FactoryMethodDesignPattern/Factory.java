/*
 * @ (#) Factory.java       1.0     07/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 07/03/2025
 * @version:    1.0
 */

import com.demo.Android;
import com.demo.OS;
import com.demo.OperationSystemFactory;

public class Factory {
    public static void main(String[] args) {
//        OS obj = new Android();
//        obj.spec();

        OperationSystemFactory osf = new OperationSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();
    }
}
