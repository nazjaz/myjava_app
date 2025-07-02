import java.net.*;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket socket = serverSocket.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/plain");
            out.println();
            out.println("Hi, This is a part of the assignment by Rahul.");
            out.println("");
            out.println("This Java App got built and deployed as a container and it is running successfully!!!");
            out.close();
            socket.close();
        }
    }
}

