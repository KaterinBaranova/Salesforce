package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
        public void positiveLogin(){
            boolean isLoggedIn = loginPage.open().login(USERNAME,PASSWORD).isPageOpened();
            Assert.assertTrue(isLoggedIn);

        }
    }
