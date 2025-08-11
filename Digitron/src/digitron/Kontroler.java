/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitron;

/**
 *
 * @author Korisnik
 */
public class Kontroler {
    private model mk;

    public Kontroler(model mk) {
        this.mk = mk;
    }
    
    public double saberi()
    {
        return mk.getPrviOp() + mk.getDrugiOp();
    }
    
    public double oduzmi ()
    {
        return  mk.getPrviOp() - mk.getDrugiOp();
    }
    
    public double pomnozi()
    {
        return mk.getDrugiOp()*mk.getPrviOp();
    }
    
    public double podijeli() throws IllegalArgumentException
    {
        if (mk.getDrugiOp()==0) throw new IllegalArgumentException("Dijeljenje nulom");
        else
        {
        return mk.getPrviOp()/mk.getDrugiOp();
        }
    }
}
