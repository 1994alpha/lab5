package ru.alpha.tests;

import org.junit.Test;
import ru.alpha.lab5.StrLine;
import static org.junit.Assert.*;
public class StrLineTest{

@Test
public void testDegree() {
        System.out.println("Проверка метода degree()");
        StrLine s = new StrLine(6,3);
        assertEquals(1, s.degree(), 0.00001);
    }
}
