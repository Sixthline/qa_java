package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline spyFeline;

    // Проверяем что при вызове метода "eatMeat()", метод "getFood()" вызывается с параметром "Хищник"
    @Test
    public void eatMeatCallsGetFoodWithCorrectValue() throws Exception {
        spyFeline.eatMeat();
        Mockito.verify(spyFeline).getFood("Хищник");
    }

    // Проверяем что метод "getFamily()" возвращает название семейства "Кошачьи"
    @Test
    public void getFamilyReturnsCorrectValue() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    // Проверяем что при вызове метода "getKittens()", метод "getKittens(int kittensCount)" вызывается с параметром "1"
    @Test
    public void getKittensCallsGetKittensWithCorrectValue() {
        spyFeline.getKittens();
        Mockito.verify(spyFeline).getKittens(1);
    }

    // Проверяем что при вызове метода "getKittens(int kittensCount)", возвращается корректное значение
    @Test
    public void getKittensWithKittensCountReturnsCorrectValue() {
        Feline feline = new Feline();
        int expectedResult = 5;
        int actualResult = feline.getKittens(5);
        assertEquals(expectedResult, actualResult);
    }
}