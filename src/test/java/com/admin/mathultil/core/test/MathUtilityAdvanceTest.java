/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.admin.mathultil.core.test;

import com.admin.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Administrator
 */
public class MathUtilityAdvanceTest {
    public static Object[][] initTestData()
    {
        Object[][] testData = {{0,1},
                               {1,1},
                               {2,2},
                               {5,120},
                               {6,720}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void checkFactGivenRight(int n,long expected)
    {
        assertEquals(expected, MathUtility.getFatorial(n));
    }
    //TTD - test Driven development
    //Kĩ Thuật viết code xen kẽ với viết test case
    //viết code và test cùng với nhau thì gọi là kĩ thuật lập trình hướng về kiểm thử
    
    //DDT
    //Là kĩ thuật test để bộ data ra một chỗ khác vd
    //{6,720} -> fill vào 2 biến n, expected và lát hồi 2 biến này đc fill vào hàm
}
