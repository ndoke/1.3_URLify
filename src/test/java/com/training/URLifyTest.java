package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class URLifyTest {
    URLify urLify = new URLify();

    @Test
    public void test() {
        Assert.assertEquals(urLify.convertToURL(""), "");
        Assert.assertEquals(urLify.convertToURL("  "), "%20%20");
        Assert.assertEquals(urLify.convertToURL("My name is Nachiket Doke."),
                "My%20name%20is%20Nachiket%20Doke.");
        Assert.assertEquals(urLify.convertToURL("My name  is   Nachiket Doke."),
                "My%20name%20%20is%20%20%20Nachiket%20Doke.");
    }
}
