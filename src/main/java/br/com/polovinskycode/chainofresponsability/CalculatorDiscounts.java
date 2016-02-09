package br.com.polovinskycode.chainofresponsability;

import br.com.polovinskycode.chainofresponsability.model.Budget;

public class CalculatorDiscounts {

    public double calculate(Budget budget) {
        Discount d1 = new DiscountForFiveItems();
        Discount d2 = new DiscountLargeFiveHundredDollars();
        Discount d3 = new NoDiscount();

        d1.next(d2);
        d2.next(d3);

        return d1.calculate(budget);
    }
}
