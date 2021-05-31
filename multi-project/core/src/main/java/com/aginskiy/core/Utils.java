package com.aginskiy.core;


import com.aginskiy.util.StringUtils;

public class Utils {

    public static Boolean isAllPositiveNumbers(String... str) {
        boolean isAllPositive = true;
        for(String numStr : str) {
            isAllPositive = StringUtils.isPositiveNumber(numStr);
        }
        return isAllPositive;
    }
}
