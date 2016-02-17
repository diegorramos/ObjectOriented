package br.com.polovinskycode.templatemethod;

import br.com.polovinskycode.templatemethod.model.Budget;

public class Payroll extends TemplateConditionalTax {

    @Override
    public double minimumRate(Budget budget) {
        return budget.getValue() * 0.05;
    }

    @Override
    public double maximumRate(Budget budget) {
        return budget.getValue() * 0.12;
    }

    @Override
    public boolean useMaximumRate(Budget budget) {
        return budget.getValue() > 600;
    }
}
