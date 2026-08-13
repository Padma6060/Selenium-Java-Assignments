package org.testleaf.week4.day1;

public class subclass extends BrowserReport {

    public void takesnap() {

        super.takeSnap();
        System.out.println("take snap");

    }

    public static void main(String[] args) {
        subclass object = new subclass();
        object.takesnap();
        object.reportSnap();
    }


}
