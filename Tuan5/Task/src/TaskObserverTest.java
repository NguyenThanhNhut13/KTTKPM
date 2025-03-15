/*
 * @ (#) TaskObserverTest.java       1.0     15/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

/*
 * @description:
 * @author: Nguyen Thanh Nhut
 * @date: 15/03/2025
 * @version:    1.0
 */

import observer.Observer;
import observer.Task;
import observer.TeamMember;

public class TaskObserverTest {
    public static void main(String[] args) {
        Task task = new Task();

        Observer member1 = new TeamMember("Thành viên A");
        Observer member2 = new TeamMember("Thành viên B");

        task.register(member1);
        task.register(member2);

        task.setStatus("Đang thực hiện");
        task.setStatus("Hoàn thành");
    }
}
