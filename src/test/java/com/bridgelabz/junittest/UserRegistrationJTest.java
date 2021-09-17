package com.bridgelabz.junittest;

import org.junit.Assert;
import org.junit.Test;



class UserRegistrationJTest {
    UserRegistrationJ userRegistration = new UserRegistrationJ();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Rajendra");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("rajendra");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Gund");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("gund");
        Assert.assertEquals(false, result);

    }
}