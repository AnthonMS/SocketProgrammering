package com.company;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[]args){
        try{
            Socket s = new Socket("127.0.0.1", 8001);

            while (true){
                InputStream input = s.getInputStream();
                OutputStream output = s.getOutputStream();

                Scanner in = new Scanner(input);
            }
        }
    }
}
