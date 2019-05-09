package com.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 15:43:20
 **/
public class Leader implements IEmployee {

    private Map<String,IEmployee> map = new HashMap<>();
    public Leader(){
        map.put("技术架构",new EmployeeA());
        map.put("业务架构",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        map.get(command).doing(command);
    }
}
