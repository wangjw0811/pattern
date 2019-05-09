package com.pattern.delegate;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 15:51:17
 **/
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("员工A执行"+command+"任务");
    }
}
