import java.io.*;
import java.net.*;
public class Client
{
    public static void main(String args[])
    {
        try
       {
           Socket s=new Socket("172.20.30.93",5000);
System.out.println("Connected");
           DataOutputStream d=new DataOutputStream(s.getOutputStream());
           d.writeUTF("Hello from Anandu");
           d.flush();
           d.close();
           s.close();
         }
         catch (Exception e) {
            System.out.println(e);
         } 
    }
}