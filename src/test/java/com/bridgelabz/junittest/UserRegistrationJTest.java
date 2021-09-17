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

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.email("rajendra11@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.email("rajendra&gund@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 9604315270");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.phoneNumber("919604315270");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.password("rajendra");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.password("raj@22");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule2("rajendra123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule2("raj@22");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule3("rajendra123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule3("rajendra@gn");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.password("rajendra@123");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.password("raj22");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc123@gmail.a –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc123@.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator(".abc@abc.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc.@gmail.com –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
        Assert.assertEquals(false, result);
    }

}