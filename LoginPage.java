package org.testleaf.week4.day1;

public class LoginPage extends BasePage {

    public void performCommonTasks() {

        super.performCommonTasks();

        System.out.println("Perform the given common tasks");
        
    }

    public static void main(String[] args) {
        LoginPage object = new LoginPage();
        object.clickElement();
        object.findElement();
        object.enterText();
        object.performCommonTasks();
       
    }

}
