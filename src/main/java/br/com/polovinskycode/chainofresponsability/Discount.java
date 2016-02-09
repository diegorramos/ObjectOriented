package br.com.polovinskycode.chainofresponsability;

import br.com.polovinskycode.chainofresponsability.model.Budget;

public interface Discount {

    double calculate(Budget budget);
    void next(Discount next);
}
