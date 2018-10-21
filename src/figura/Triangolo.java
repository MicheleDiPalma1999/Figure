/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author mikid
 */
class TriangoloScaleno extends Figure {

    private int lato2;
    private int lato3;
    private double area;

    public TriangoloScaleno(int lato1, int lato2, int lato3) {
        super.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        nLati = 3;
    }

    public int getLato2() {
        return lato2;
    }

    public int getLato3() {
        return lato3;
    }

    public double getArea() {
        return area;
    }

    public void setLato2(int lato2) {
        this.lato2 = lato2;
    }

    public void setLato3(int lato3) {
        this.lato3 = lato3;
    }

    private double calcolaSemiperimetro() {
        return (lato1 + lato2 + lato3) / 2.0;
    }

    public double cercaPerimetro() {
        perimetro = lato1 + lato2 + lato3;
        return perimetro;
    }

    public double cercaArea() {
        double semiperimetro = calcolaSemiperimetro();
        area = Math.sqrt(
                semiperimetro * ((semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3))
        );

        return area;
    }

    @Override
    public String toString() {
        return "TriangoloScaleno{" + "lato2=" + lato2 + ", lato3=" + lato3 + ", area=" + area + '}';
    }

}

class TriangoloEquilatero extends Figure {

    private int lato2;
    private int lato3;
    private double area;

    public TriangoloEquilatero(int lato1, int lato2, int lato3) {
        super.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        nLati = 3;
    }

    public int getLato2() {
        return lato2;
    }

    public int getLato3() {
        return lato3;
    }

    public double getArea() {
        return area;
    }

    public void setLato2(int lato2) {
        this.lato2 = lato2;
    }

    public void setLato3(int lato3) {
        this.lato3 = lato3;
    }

    public double cercaPerimetro() {
        perimetro = lato1 + lato2 + lato3;
        return perimetro;
    }

    public double cercaArea() {
        area = (lato1 * lato2) / 2.0;
        return area;
    }

    @Override
    public String toString() {
        return "TriangoloEquilatero{" + "lato2=" + lato2 + ", lato3=" + lato3 + ", area=" + area + '}';
    }

}
