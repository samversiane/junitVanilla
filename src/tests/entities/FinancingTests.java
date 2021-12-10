package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void financingShouldCreateObjectWithCorrectDataWhenValidData() {

        double totalAmount = 100000;
        double income = 2000;
        int months = 80;

        Financing financing = new Financing(
                totalAmount, income, months);

        Assertions.assertEquals(totalAmount, financing.getTotalAmount());
        Assertions.assertEquals(income, financing.getIncome());
        Assertions.assertEquals(months, financing.getMonths());
    }

    @Test
    public void financingShouldNotCreateObjectWithCorrectDataWhenInvalidData() {

        double totalAmount = 100000;
        double income = 2000;
        int months = 20;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Financing(totalAmount, income, months);
        });
    }

    @Test
    public void setTotalAmountShouldUpdateValueWhenValidData() {

        double totalAmountUpdate = 10000;
        double totalAmount = 100000;
        double income = 2000;
        int months = 80;

        Financing financing = new Financing(
                totalAmount, income, months);

        financing.setTotalAmount(totalAmountUpdate);

        Assertions.assertEquals(totalAmountUpdate, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldNotUpdateValueWhenInvalidData() {

        double totalAmountUpdate = 200000;
        double totalAmount = 100000;
        double income = 2000;
        int months = 80;

        Financing financing = new Financing(totalAmount, income, months);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            financing.setTotalAmount(totalAmountUpdate);
        });
    }

    @Test
    public void setIncomeAmountShouldUpdateValueWhenValidData() {

        double incomeUpdate = 10000;
        double totalAmount = 100000;
        double income = 2000;
        int months = 80;

        Financing financing = new Financing(
                totalAmount, income, months);

        financing.setIncome(incomeUpdate);

        Assertions.assertEquals(incomeUpdate, financing.getIncome());
    }

    @Test
    public void setIncomeAmountShouldNotUpdateValueWhenInvalidData() {

        double incomeUpdate = 1000;
        double totalAmount = 100000;
        double income = 2000;
        int months = 80;

        Financing financing = new Financing(totalAmount, income, months);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            financing.setIncome(incomeUpdate);
        });
    }

    @Test
    public void setMonthsAmountShouldUpdateValueWhenValidData() {

        int monthsUpdate = 90;
        double totalAmount = 100000;
        double income = 2000;
        int months = 80;

        Financing financing = new Financing(
                totalAmount, income, months);

        financing.setMonths(monthsUpdate);

        Assertions.assertEquals(monthsUpdate, financing.getMonths());
    }

    @Test
    public void setMonthsAmountShouldNotUpdateValueWhenInvalidData() {

        int monthsUpdate = 70;
        double totalAmount = 100000;
        double income = 2000;
        int months = 80;

        Financing financing = new Financing(totalAmount, income, months);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            financing.setMonths(monthsUpdate);
        });
    }

    @Test
    public void entryShouldCalculateRightEntryValue() {

        double totalAmount = 100000;
        double income = 2000;
        int months = 80;
        double entry = 20000;

        Financing financing = new Financing(totalAmount, income, months);

        Assertions.assertEquals(entry, financing.entry());
    }

    @Test
    public void quotaShouldCalculateRightEntryValue() {

        double totalAmount = 100000;
        double income = 2000;
        int months = 80;
        double quota = 1000;

        Financing financing = new Financing(totalAmount, income, months);

        Assertions.assertEquals(quota, financing.quota());
    }
}
