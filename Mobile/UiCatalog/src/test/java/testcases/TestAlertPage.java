package testcases;

import base.MobileAPI;
import org.testng.annotations.Test;
import pageobject.AlertPage;

public class TestAlertPage extends MobileAPI {
    private static AlertPage alertPage = new AlertPage();
    @Test
    public void testActionSheetSimple(){
        alertPage.showActionSheetSimple();
        sleep(2);
    }

    @Test
    public void testActionSheetOkCancel(){
        alertPage.showActionSheetOkCancel();
        sleep(2);
    }

    @Test
    public void testActionSheetCustom(){
        alertPage.showActionSheetCustom();
        sleep(2);
    }

    @Test
    public void testAlertSimple(){
        alertPage.showAlertSimple();
        sleep(2);
    }

    @Test
    public void testAlertOkCancel(){
        alertPage.showAlertOkCancel();
        sleep(2);
    }

    @Test
    public void testAlertCustom(){
        alertPage.showAlertCustom();
        sleep(2);
    }

    @Test
    public void showSecureTextInput(){
        alertPage.showAlertSimple();
        sleep(2);
    }
}
