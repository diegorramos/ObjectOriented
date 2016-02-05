package br.com.polovinskycode.strategy;

import java.math.BigDecimal;

public class Divide implements Calculator {

    public Long calc(Long numberOne, Long numberTwo) {
        BigDecimal result = null;
        result = BigDecimal.valueOf(numberOne).divide(BigDecimal.valueOf(numberTwo), BigDecimal.ROUND_HALF_UP);
        return result.longValue();
    }
}
