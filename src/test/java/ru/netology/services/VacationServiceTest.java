package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class VacationServiceTest {

        @ParameterizedTest
        @CsvFileSource (files="src/test/resources/Vocation.csv")
    public void testCSV(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }

//    @Test
//    public void testVacationFreelancePoor() {
//        VacationService service = new VacationService();
//
//        int expected = 3;
//        int actual = service.calculate(10_000, 3_000, 20_000);
//        Assertions.assertEquals(expected, actual);
//
//    }

//    @Test
//    public void testVacationFreelanceRich() {
//        VacationService service = new VacationService();
//
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//        Assertions.assertEquals(expected, actual);
//
//    }
}