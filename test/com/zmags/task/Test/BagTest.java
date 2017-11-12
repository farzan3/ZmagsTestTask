package com.zmags.task.Test;

import com.zmags.task.Bag;
import org.junit.Test;
import static org.junit.Assert.*;

public class BagTest {

    /**
     * Test of get method, of class Bag.
     */
    @Test
    public void testGet() {

        Bag<String> bag = makeBag();
        String expResult = "3";
        Object result = bag.get(2);
        assertEquals(expResult, result);

    }

    /**
     * Test of set method, of class Bag.
     */
    @Test
    public void testSet() {

        Bag<String> bag = makeBag();
        String expResult = "4";
        bag.set(1, "4");
        Object result = bag.get(1);
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class Bag.
     */
    @Test
    public void testSize() {

        Bag<String> bag = makeBag();
        int result = bag.size();
        int expResult = 3;
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class Bag.
     */
    @Test
    public void testIsEmpty() {

        Bag<String> bag = new Bag<>();
        Boolean result = bag.isEmpty();
        Boolean expResult = true;
        assertEquals(expResult, result);

    }

    /**
     * Test of contains method, of class Bag.
     */
    @Test
    public void testContains() {
        Bag<String> bag = makeBag();
        boolean result = bag.contains("2");
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Bag.
     */
    @Test
    public void testAdd() {

        Bag<String> bag = makeBag();
        bag.add("4");
        String result = bag.get(3);
        String expResult = "4";
        assertEquals(expResult, result);
    }

    /**
     * Test of clear method, of class Bag.
     */
    @Test
    public void testClear() {

        Bag<String> bag = makeBag();
        bag.clear();
        int result = bag.size();
        int expResult = 0;
        assertEquals(expResult, result);
    }

    private Bag<String> makeBag() {

        Bag<String> bag = new Bag<String>();
        bag.add("1");
        bag.add("2");
        bag.add("3");
        return bag;
    }
}
