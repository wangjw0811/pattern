package com.pattern.strategy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jims Wang
 * @date 2019-04-19 21:05
 */
public class Util {

    public static String getNo(String prefix){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String format = sdf.format(new Date());
        String result = prefix+format;
        System.out.println(result);
        return result;
    }

}
