package org.testleaf.week4.day1;

public class JavaConnection extends MySqlConnection {

    public void connect() {

        System.out.println("The database connected successfully");

    }

    public void disconnect() {

        System.out.println("The database got disconnected");

    }

    public void executeUpdate() {

        System.out.println("The database got executed and updated");

    }


    public static void main(String[] args) {
        JavaConnection object = new JavaConnection();
        object.connect();
        object.disconnect();
        object.executeUpdate();
        object.executeQuery();

    }

}
