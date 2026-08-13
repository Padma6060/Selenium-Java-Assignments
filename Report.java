package org.testleaf.week4.day1;

public class Report {

    public void reportStep(String msg, String status) {

        System.out.println("message:"+ msg);
        System.out.println("status:" + status);
    }

    public void reportStep(String msg, String status, boolean snap){

        System.out.println("message:"+ msg);
        System.out.println("status:" + status);
        System.out.println("snap:" + snap);
    }

    public static void main(String[] args) {
        
        Report ReportOptions= new Report();
        ReportOptions.reportStep("Login completed", "passed");
        ReportOptions.reportStep("Login failed", "fail", true);
    }

}
