package br.com.polovinskycode.templatemethod;

import br.com.polovinskycode.templatemethod.model.Budget;

public class InternalRevenueService extends TemplateConditionalTax {

    @Override
    public double minimumRate(Budget budget) {
        return budget.getValue() * 0.06;
    }

    @Override
    public double maximumRate(Budget budget) {
        return budget.getValue() * 0.10;
    }

    @Override
    public boolean useMaximumRate(Budget budget) {
        return budget.getValue() > 500;
    }
}
