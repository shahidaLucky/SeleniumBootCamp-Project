package loginSearch;

import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 1/15/2016.
 */
public class Login extends Base {
    @Test
    public void test2() throws InterruptedException {

            System.out.println("Test has started");
            typeByCss("#email", "shahidalus@yahoo.com");
            typeByCss("#pass", "shahidalus@yahoo.com");
            sleepFor(3);
            ClickOnCss("#u_0_n");

            System.out.println(driver.getCurrentUrl());
            System.out.println("Test has ended");
        }
}
