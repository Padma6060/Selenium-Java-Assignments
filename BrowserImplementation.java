package org.testleaf.week4.day1;

public class BrowserImplementation extends Element {

    public void click() {

        System.out.println("click the url");

    }
    public void sendValues() {
       
        System.out.println("give input");

    }
    public void locateElement() {

        super.locateElement();
        System.out.println("locate the element");

    }

    public static void main(String[] args) {
        BrowserImplementation object = new BrowserImplementation();
        object.click();
        object.sendValues();
        object.locateElement();
    }

}
