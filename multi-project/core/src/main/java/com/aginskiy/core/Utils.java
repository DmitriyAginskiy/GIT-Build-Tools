package com.aginskiy.core;


import com.aginskiy.util.StringUtils;

public class Utils {

    public static Boolean isAllPositiveNumbers(String... str) {
        if(str == null || str.length < 1) {
            return false;
        }
        for(String numStr : str) {
            if(!StringUtils.isPositiveNumber(numStr)) {
                return false;
            }
        }
        return true;
    }
}
