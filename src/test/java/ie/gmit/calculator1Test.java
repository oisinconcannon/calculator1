/*
Oisin Concannon
Software Eng w/Test
G00347603
18/02/21
 */

package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculator1Test {

    @Test
    void addTest(){
       calculator1 myCalc = new calculator1();
       int result = myCalc.add(10,50);
       assertEquals(60,result,0);

    }

    @Test
    void subtractTest(){
        calculator1 myCalc = new calculator1();
        int result = myCalc.subtract(12,6);
        assertEquals(6,result,0);

    }
    @Test
    void divideTest(){
        calculator1 myCalc = new calculator1();
        int result = myCalc.divide(20,5);
        assertEquals(4,result,0);

    }
    @Test
    void multiplyTest(){
        calculator1 myCalc = new calculator1();
        int result = myCalc.multiply(6,3);
        assertEquals(18,result,0);

    }
}
