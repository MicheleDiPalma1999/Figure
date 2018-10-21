/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import static figura.Ifigura.PIGRECO;

/**
 *
 * @author mikid
 */
abstract class Figure implements Ifigura {

    protected int nLati = 1;
    protected int lato1;
    protected double perimetro;

    Figure() {
        lato1 = 1;
    }

    Figure(int lato1) {
        this.lato1 = lato1;
    }

    public int getnLati() {
        return nLati;
    }

    public int getLato1() {
        return lato1;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setLato1(int lato1) {
        this.lato1 = lato1;
    }

    public static double getPIGRECO() {
        return PIGRECO;
    }

    @Override
    public double cercaPerimetro() {

        perimetro = lato1;
        return perimetro;
    }

    @Override
    public abstract double cercaArea();

}



