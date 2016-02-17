package br.com.polovinskycode.templatemethod;

import br.com.polovinskycode.templatemethod.model.Budget;

public abstract class TemplateConditionalTax implements Tax {

    public double calculateBudget(Budget budget) {
        if (useMaximumRate(budget)) {
            return maximumRate(budget);
        } else {
            return minimumRate(budget);
        }
    }

    public abstract double minimumRate(Budget budget);

    public abstract double maximumRate(Budget budget);

    public abstract boolean useMaximumRate(Budget budget);
}
