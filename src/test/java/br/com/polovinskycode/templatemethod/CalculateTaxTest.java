package br.com.polovinskycode.templatemethod;

import br.com.polovinskycode.templatemethod.model.Budget;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class CalculateTaxTest {

    @Test
    public void calculateTax_GivenGreaterThan_ShouldSeventy_InternalRevenueService() throws Exception {

        Budget budget = new Budget(700.0);
        CalculateTax tax = new CalculateTax(new InternalRevenueService());
        double value = tax.calculate(budget);
        assertThat(value, is(70d));
    }

    @Test
    public void calculateTax_GivenLessThan_ShouldTwentyFour_InternalRevenueService() throws Exception {

        Budget budget = new Budget(400.0);
        CalculateTax tax = new CalculateTax(new InternalRevenueService());
        double value = tax.calculate(budget);
        assertThat(value, is(24d));
    }

    @Test
    public void calculateTax_GivenGreaterThan_ShouldSeventy_Payroll() throws Exception {

        Budget budget = new Budget(700.0);
        CalculateTax tax = new CalculateTax(new Payroll());
        double value = tax.calculate(budget);
        assertThat(value, is(84d));
    }

    @Test
    public void calculateTax_GivenLessThan_ShouldTwentyFour_Payroll() throws Exception {

        Budget budget = new Budget(400.0);
        CalculateTax tax = new CalculateTax(new Payroll());
        double value = tax.calculate(budget);
        assertThat(value, is(20d));
    }
}