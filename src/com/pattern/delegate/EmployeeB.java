package com.pattern.delegate;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 16:03:20
 **/
public class EmployeeB implements IEmployee {

    @Override
    public void doing(String command) {
        System.out.println("员工B执行"+command+"任务");
    }
}
