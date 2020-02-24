package edu.escuelaing.arep.Handss.impl;

import java.lang.reflect.Method;

import edu.escuelaing.arep.Handss.Handler;

public class methodHandler implements Handler {
    private Method metodo;

    
    public methodHandler(Method metodo){
        this.metodo=metodo;
    }

    
    public String procesar(){
        try{
            //metodos estaticos sin parametros 
             return (String) metodo.invoke(null,null);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        } 
    }
    

    //@Override
    public String procesarConParametros(Object[] parametro) {
         try{
            System.out.println(metodo.getName());
             System.out.println(metodo.getParameterCount());
             return (String) metodo.invoke(null,parametro);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        } 
    }
}
