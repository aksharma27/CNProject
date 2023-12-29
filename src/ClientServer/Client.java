package ClientServer;

import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client machine");
            ServerSocket ss = new ServerSocket(5555);  //ip address, and port number of our client machine
            Socket socket = new Socket("localhost", 5555);
            System.out.println("connection established");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
