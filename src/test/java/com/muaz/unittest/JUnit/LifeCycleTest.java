package com.muaz.unittest.JUnit;

import org.junit.*;

/**
 * Created by muazt on 31.01.2018.
 */
public class LifeCycleTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("************* beforeClass *********");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("*************** afterClass ***********");
    }
    @Before
    public void setUp() throws Exception{
        System.out.println("invoke before methods");
    }

    @After
    public void tearDown()throws Exception{
        System.out.println("invoke after methods");
    }
    @Test
    public void testHelloWorld1() throws Exception{
        System.out.println("@Test Hello World1");
    }
    @Test
    public void testHelloWorld2() throws Exception{
        System.out.println("@Test Hello World2");
    }
}
