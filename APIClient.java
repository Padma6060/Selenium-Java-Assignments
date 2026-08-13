package org.testleaf.week4.day1;

public class APIClient {

    public void sendRequest(String endPoint) {

        System.out.println("the endpoint of the request" +endPoint);

    }

    public void sendRequest(String endPoint, String requestBody, Boolean requestStatus) {

        System.out.println("the endpoint of the request" +endPoint);
        System.out.println("The requestbody is" +requestBody);
        System.out.println("The requestStatus is" +requestStatus);
    
    }


    public static void main(String[] args) {
        
        APIClient object = new APIClient();
        object.sendRequest("https://example.com");
        object.sendRequest("https://example.com", "JSON format", true);

    }

}
