package edu.escuelaing.arep;


import edu.escuelaing.arep.Handler;
import java.util.HashMap;
import java.util.Map;


public class ListaURLHandler {
	
	private Map<String, Handler> mapa;
    
    public ListaURLHandler(){
        mapa = new HashMap<String, Handler>();
    }
    
    public boolean busque(String busq){
        return mapa.containsKey(busq);
    }
    
    public void put(String key, Handler value){
        mapa.put(key, value);
    }
    
    public Handler get(String key){
        return mapa.get(key);
    }
    
}
