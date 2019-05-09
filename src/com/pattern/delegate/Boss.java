package com.pattern.delegate;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 15:02:14
 **/
public class Boss {


    public void command(String command,Leader leader){
        leader.doing(command);
    }

}
