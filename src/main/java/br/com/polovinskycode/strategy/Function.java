package br.com.polovinskycode.strategy;

import br.com.polovinskycode.validate.NumberValidate;

public class Function {

    private Calculator calculator;

    public Function(Calculator calculator) {
        this.calculator = calculator;
    }

    public Long calc(Long numberOne, Long numberTwo) {
        NumberValidate.validate(numberOne, numberTwo);
        Long result = calculator.calc(numberOne, numberTwo);
        return result;
    }
}
