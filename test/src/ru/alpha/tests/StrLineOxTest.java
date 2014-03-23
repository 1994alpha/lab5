package ru.alpha.tests;

import org.junit.Test;
import ru.alpha.lab5.StrLineOx;
import static org.junit.Assert.*;
public class StrLineOxTest{

@Test
public void testDegree() {
        System.out.println("Проверка метода degree()");
        StrLineOx s = new StrLineOx(6);
        assertEquals(0, s.degree(), 0.00001);
    }
}
