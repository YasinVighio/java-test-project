package com.test.project;

import org.junit.Assert;
import org.junit.Test;

public class HelloClassTest {
    @Test
    public void testMethod(){
        Assert.assertTrue("Test".equals(HelloClass.firstLetterCapital("test")));
    }
}
