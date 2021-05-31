package com.aginskiy.util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static Boolean isPositiveNumber(String str) {
        return NumberUtils.isDigits(str) && NumberUtils.createInteger(str) > 0;
    }
}
