/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitron;

/**
 *
 * @author Korisnik
 */
public class model {
    private double prviOp;
    private double drugiOp;

    public model(double prviOp, double drugiOp) {
        this.prviOp = prviOp;
        this.drugiOp = drugiOp;
    }

    public double getPrviOp() {
        return prviOp;
    }

    public void setPrviOp(double prviOp) {
        this.prviOp = prviOp;
    }

    public double getDrugiOp() {
        return drugiOp;
    }

    public void setDrugiOp(double drugiOp) {
        this.drugiOp = drugiOp;
    }
    
    public model (String p, String d) //Novi konstruktor da nam pomogne u akciji buttona
    {
        prviOp = Double.parseDouble(p);
        drugiOp= Double.parseDouble(d);
    }
    
}
