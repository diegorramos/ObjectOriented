package br.com.polovinskycode.strategy;

import java.math.BigDecimal;

public class Subtract implements Calculator {

    public Long calc(Long numberOne, Long numberTwo) {
        BigDecimal result = null;
        if (numberOne >= numberTwo) {
            result = BigDecimal.valueOf(numberOne).subtract(BigDecimal.valueOf(numberTwo));
        } else if (numberTwo >= numberOne) {
            result = BigDecimal.valueOf(numberTwo).subtract(BigDecimal.valueOf(numberOne));
        }
        return result.longValue();
    }
}
