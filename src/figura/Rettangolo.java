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
class Rettangolo extends Figure {

    private int lato2;
    private int lato3;
    private int lato4;
    private double area;

    public Rettangolo(int lato1, int lato2, int lato3, int lato4) {
        super.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.lato4 = lato4;
        nLati = 4;
    }

    public int getLato2() {
        return lato2;
    }

    public int getLato3() {
        return lato3;
    }

    public int getLato4() {
        return lato4;
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

    public void setLato4(int lato4) {
        this.lato4 = lato4;
    }

    public double cercaPerimetro() {
        perimetro = lato1 + lato2 + lato3 + lato4;
        return perimetro;
    }

    public double cercaArea() {
        area = (lato1 * lato2);
        return area;
    }

    @Override
    public String toString() {
        return "Rettangolo{" + "lato2=" + lato2 + ", lato3=" + lato3 + ", lato4=" + lato4 + ", area=" + area + '}';
    }

}


