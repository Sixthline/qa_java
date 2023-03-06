package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline mockFeline;

    // Проверяем что метод "getSound()" возвращает строку "Мяу"
    @Test
    public void getSoundReturnsCorrectValue() {
        Cat cat = new Cat(mockFeline);
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals(expectedResult, actualResult);
    }

    // Проверяем что метод "getFood()" вызавает метод "eatMeat()"
    @Test
    public void getFoodCallsEatMeat() throws Exception {
        Cat cat = new Cat(mockFeline);
        cat.getFood();
        Mockito.verify(mockFeline).eatMeat();
    }
}