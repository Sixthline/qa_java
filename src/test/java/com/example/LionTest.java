package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Lion lion;

    @Mock
    Feline mockFeline;

    // Проверяем конструктор класса, сценарий с исключением
    @Test(expected = Exception.class)
    public void exceptionLionTest() throws Exception {
        lion = new Lion("амец", mockFeline);
    }

    // Проверяем что метод "getKittens()" вызавает метод "getKittens()" класса Feline
    @Test
    public void getKittensCallsGetKittensFeline() throws Exception {
        lion = new Lion("Самец", mockFeline);
        lion.getKittens();
        Mockito.verify(mockFeline).getKittens();
    }

    // Проверяем что метод "getFood()" вызавает метод "getFood()" класса Feline со строчным параметром "Хищник"
    @Test
    public void getFoodCallsGetFoodFeline() throws Exception {
        lion = new Lion("Самка", mockFeline);
        lion.getFood();
        Mockito.verify(mockFeline).getFood("Хищник");
    }

    // Проверяем что метод "doesHaveMane()" возвращает True
    @Test
    public void doesHaveManeReturnsTrue() throws Exception {
        lion = new Lion("Самец", mockFeline);
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }


}