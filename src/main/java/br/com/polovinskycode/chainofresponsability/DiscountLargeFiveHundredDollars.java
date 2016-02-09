package br.com.polovinskycode.chainofresponsability;

import br.com.polovinskycode.chainofresponsability.model.Budget;

public class DiscountLargeFiveHundredDollars implements Discount {

    private Discount next;

    public double calculate(Budget budget) {
        if (budget.getValue() > 500) {
            return budget.getValue() * 0.07;
        } else {
            return next.calculate(budget);
        }
    }

    public void next(Discount next) {
       this.next = next;
    }
}
