package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrisedTest {
    private final String sex;
    private final boolean expected;


    public LionParametrisedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    Feline mockFeline = Mockito.mock(Feline.class);

    @Test
    public void test() throws Exception {
        Lion lion = new Lion(sex, mockFeline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}