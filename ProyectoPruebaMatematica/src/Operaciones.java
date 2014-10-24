/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */
public class Operaciones {
    
    private int x;
    private int y;
   
    public Operaciones(int x , int y)
    {
        this.x = x;
        this.y = y;
        
    }
    
    public int suma()
    {
        return x+y;
    }
    
    public double division()
    {
        if (y!=0)
            return x/y;
        else
            return 0;
    }
    public int resta()
    {
        return x-y;
    }
    
    public double multiplicacion(){
        return x*y;
    }
    
    
}
