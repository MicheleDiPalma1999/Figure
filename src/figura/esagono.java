package figura;

public class esagono extends Pentagono {

    int lato6;

    public esagono(int lato1, int lato2, int lato3, int lato4, int lato5, int lato6) {
        super(lato1, lato2, lato3, lato4, lato5);
        this.lato6 = lato6;
    }

    public int getLato6() {
        return lato6;
    }

    public double cercaPerimetro() {
        perimetro = lato1 + getLato2() + getLato3() + getLato4() + getLato5() + lato6;
        return perimetro;
    }

}
