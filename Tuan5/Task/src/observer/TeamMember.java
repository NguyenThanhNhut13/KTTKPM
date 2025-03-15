/*
 * @ (#) TeamMember.java       1.0     15/03/2025
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

public class TeamMember implements Observer {

    private final String memberName;

    public TeamMember(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public void update(String status) {
        System.out.println(memberName + " nhận thông báo: Trạng thái công việc thay đổi -> " + status);
    }
}
