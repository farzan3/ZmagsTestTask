
package com.zmags.task.Test;

import com.zmags.task.TriangleAnalyzer;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleAnalyzerTest {
    
    @Test
    public void isSCALENET() {
      
        TriangleAnalyzer instance = new TriangleAnalyzer();
        int expResult = 1;
        int result = instance.getTriangleType(4, 3, 2);
        assertEquals(expResult, result);
    }
     @Test
    public void isISOSCELES() {
      
        TriangleAnalyzer instance = new TriangleAnalyzer();
        int expResult = 2;
        int result = instance.getTriangleType(5, 5, 4);
        assertEquals(expResult, result);
    }
     @Test
    public void isEQUILATERAL() {
      
        TriangleAnalyzer instance = new TriangleAnalyzer();
        int expResult = 3;
        int result = instance.getTriangleType(5, 5, 5);
        assertEquals(expResult, result);
    }
     @Test
    public void isINVALID() {
      
        TriangleAnalyzer instance = new TriangleAnalyzer();
        int expResult = 4;
        int result = instance.getTriangleType(1, 7, 12);
        assertEquals(expResult, result);
    }
}
