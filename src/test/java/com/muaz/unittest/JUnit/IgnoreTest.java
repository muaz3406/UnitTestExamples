package com.muaz.unittest.JUnit;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {

    @Test
    public void testObey() throws Exception{
    System.out.print("Obey");
}

    @Test
    @Ignore("it can be used later")
    public void testIgnore() throws Exception{
        System.out.println("Ignore");
    }
}
