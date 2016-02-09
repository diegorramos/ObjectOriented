package br.com.polovinskycode.chainofresponsability;

import br.com.polovinskycode.chainofresponsability.model.Budget;

public class NoDiscount implements Discount {

    public double calculate(Budget budget) {
        return 0;
    }

    public void next(Discount next) {

    }
}
