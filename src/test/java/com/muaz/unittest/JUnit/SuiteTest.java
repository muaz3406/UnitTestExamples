package com.muaz.unittest.JUnit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AssertEasyTest.class,
        AssertTest.class,
        ParameterTest.class,
        LifeCycleTest.class
})
public class SuiteTest {

}
