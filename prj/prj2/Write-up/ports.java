import java.io.*;
import java.net.*;
import java.util.*;
public class ports {
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome To The Worlds best port scanner");
      System.out.println("I am The One and Only Dao!");
      System.out.println("Wait you have not heard of me????");
      System.out.println("enter 0 if you know of I...");
      int resp = input.nextInt();
      
      if (resp == 0){
        System.out.println("You are the man!!! ...oh wait \n" +
        "..maybe that was sexist. DON'T Blame me.....Im innocent.. " +
        "Blame My Writer.");
         }
      else {
      System.out.println("I am not going to show you my amazing PORTSCANNER..Muhahah " +
      "Just Kidding.... I had you there for one second right hahaha. " + 
      "You know your lucky I am just such a nice guy " );
      }
      
      System.out.println("Now that we have taken care of the legal issues " +
       "are you ready to do some sketchy port scanning?");
      System.out.println("enter the ip you wish to scan: "); 
      
      String host = input.next();
      InetAddress findAddress = InetAddress.getByName(host);
      String hosts = findAddress.getHostName();
        for (int port = 0; port <= 65535; port++) {
            try {
                Socket socket = new Socket(hosts, port);
                String text = hosts + " is listening on port " + port;
                System.out.println(text);
                socket.close();
            } catch (IOException e) {
               // String s = hosts + " is not listening on port " + port;
               // System.out.println(s);
            }
        }
    }
}