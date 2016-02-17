package br.com.polovinskycode.templatemethod;

import br.com.polovinskycode.templatemethod.model.Budget;

public class CalculateTax {

    private Tax tax;

    public CalculateTax() {}

    public CalculateTax(Tax tax) {
        this.tax = tax;
    }

    public double calculate(Budget budget) {
        double result = tax.calculateBudget(budget);
        return result;
    }
}
