package ClientServer;
//imports
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("waiting for client");

        try {
            ServerSocket ss = new ServerSocket(5555);
            Socket soccket = ss.accept();   //establish conn and wait for client
            System.out.println("Server listening on port 5555");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
