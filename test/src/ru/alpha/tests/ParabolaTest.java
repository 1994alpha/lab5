package ru.alpha.tests;

import org.junit.Test;
import ru.alpha.lab5.Parabola;
import static org.junit.Assert.*;
public class ParabolaTest{

@Test
public void testDegree() {
        System.out.println("Проверка метода degree()");
        Parabola p = new Parabola(4, 2, -1);
        assertEquals(2, p.degree(), 0.00001);
    }
}
