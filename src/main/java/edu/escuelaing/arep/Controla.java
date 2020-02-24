package edu.escuelaing.arep;


import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SocketHandler;


public class Controla {
	
	private static ExecutorService pool = Executors.newFixedThreadPool(10);
    
    public static void main( String[] args ) throws Exception
    {
        HttpServer ap=new HttpServer();
        //ap.inicie();   
        pool.submit(ap);
    }
}
