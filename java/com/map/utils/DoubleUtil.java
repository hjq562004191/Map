package com.map.utils;

import java.math.BigDecimal;

public class DoubleUtil {
    public static double accuracy(double a, int x) {
        BigDecimal bigDecimal = new BigDecimal(a);
        return bigDecimal.setScale(x, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
