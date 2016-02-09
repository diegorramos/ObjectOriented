package br.com.polovinskycode.chainofresponsability;

import br.com.polovinskycode.chainofresponsability.model.Budget;
import br.com.polovinskycode.chainofresponsability.model.Item;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class CalculatorDiscountsTest {

    @Test
    public void discountCalculate_WithTwoItems_GivenNoDiscount() {

        CalculatorDiscounts discounts = new CalculatorDiscounts();
        Budget budget = new Budget(500.0);
        budget.addItem(new Item("Pencil", 250.0));
        budget.addItem(new Item("Pen", 250.0));

        double finalDiscount = discounts.calculate(budget);
        assertThat("no discount", finalDiscount, is(0.0));
    }

    @Test
    public void discountCalculate_WithSixItems_GivenTenPercentDiscount() {

        CalculatorDiscounts discounts = new CalculatorDiscounts();
        Budget budget = new Budget(500.0);
        budget.addItem(new Item("Pencil", 10.0));
        budget.addItem(new Item("Pen", 2.0));
        budget.addItem(new Item("Pen Drive", 11.0));
        budget.addItem(new Item("Eraser", 3.0));
        budget.addItem(new Item("CD", 1.0));
        budget.addItem(new Item("CD-RW", 1.0));

        double finalDiscount = discounts.calculate(budget);
        assertThat(finalDiscount, is(50.0));
    }
}