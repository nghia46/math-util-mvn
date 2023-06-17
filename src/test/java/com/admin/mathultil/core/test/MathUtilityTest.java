/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.admin.mathultil.core.test;

import com.admin.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrator
 */
public class MathUtilityTest {
    @Test 
    public void checkFactGivenRight()
    {
        assertEquals(1, MathUtility.getFatorial(0));
    
    }
     @Test
    public void testFacotialGivenRightAgument0ReturnWell() {
        assertEquals(1, MathUtility.getFatorial(0));
    }

    @Test
    public void testFacotialGivenRightAgument0ReturnWell1() {
        assertEquals(1, MathUtility.getFatorial(0));
    }

    @Test
    public void testFacotialGivenRightAgument0ReturnWell2() {
        assertEquals(1, MathUtility.getFatorial(0));
    }

    @Test
    public void testFacotialGivenRightAgument0ReturnWell3() {
        assertEquals(1, MathUtility.getFatorial(0));
    }

    @Test
    public void testFacotialGivenRightAgumentReturnWell() {
        assertEquals(1, MathUtility.getFatorial(0));

    }
    //TDD: test driven development
    //DDT: data driven testing
}
