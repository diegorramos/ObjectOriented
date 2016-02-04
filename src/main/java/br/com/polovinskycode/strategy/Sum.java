package br.com.polovinskycode.strategy;

import java.math.BigDecimal;

public class Sum implements Calculator {

    public Long calc(Long numberOne, Long numberTwo) {
        BigDecimal result = null;
        result = BigDecimal.valueOf(numberOne).add(BigDecimal.valueOf(numberTwo));
        return result.longValue();
    }
}
