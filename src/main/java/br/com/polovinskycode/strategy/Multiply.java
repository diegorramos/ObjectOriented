package br.com.polovinskycode.strategy;

import java.math.BigDecimal;

public class Multiply implements Calculator {

    public Long calc(Long numberOne, Long numberTwo) {
        BigDecimal result = null;
        result = BigDecimal.valueOf(numberOne).multiply(BigDecimal.valueOf(numberTwo));
        return result.longValue();
    }
}
