/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Coronel
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
    
    public int resta()
    {
        return x-y;
    }
    
    
    public int multiplicacion()
    {
        return x*y;
    }
    
     public double division()
    {
        if (y!=0)
            return x/y;
        else
            return 0;
    }
}
