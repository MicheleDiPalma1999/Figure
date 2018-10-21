package figura;

import java.util.Scanner;

class test {

    int lato1 = 0;
    int lato2 = 0;
    int lato3 = 0;
    int lato4 = 0;
    int lato5 = 0;
    Scanner scan1 = new Scanner(System.in);

    public void test() {
        System.out.println("Quanti lati inserire?");
        int tmp = 0;

        try {
            tmp = scan1.nextInt();
        } catch (Exception e) {
            System.out.println("Numero inserito non valido!");
        }
        if (!controllo(tmp)) {
            System.out.println("Numero lati non accettabile!");
        }

        switch (tmp) {
            case 3:
                if (assegnazioneT()) {
                    if (controllolatiTriangolo() == 1) {
                        System.out.println("Triangolo equilatero");
                        TriangoloEquilatero t1 = new TriangoloEquilatero(lato1, lato2, lato3);
                        System.out.println("L'area è di : " + t1.cercaArea());
                        System.out.println("Il perimetro : " + t1.cercaPerimetro());
                    } else {
                        System.out.println("Triangolo scaleno");
                        TriangoloScaleno t1 = new TriangoloScaleno(lato1, lato2, lato3);
                        System.out.println("L'area è di : " + t1.cercaArea());
                        System.out.println("Il perimetro : " + t1.cercaPerimetro());
                    }
                } else {
                    System.out.println("Errore dati inseriti!");
                }
                break;
            case 4:
                if (assegazioneQ()) {
                    if (controllolatiQuadrato() == 1) {
                        System.out.println("Quadrato");
                        Quadrato t1 = new Quadrato(lato1, lato2, lato3, lato4);
                        System.out.println("L'area è di : " + t1.cercaArea());
                        System.out.println("Il perimetro : " + t1.cercaPerimetro());
                    } else if (controllolatiQuadrato() == 2) {
                        System.out.println("Rettangolo");
                        Rettangolo t1 = new Rettangolo(lato1, lato2, lato3, lato4);
                        System.out.println("L'area è di : " + t1.cercaArea());
                        System.out.println("Il perimetro : " + t1.cercaPerimetro());
                    }
                } else {
                    System.out.println("Errore dati inseriti!");
                }

                break;
            case 5:
                if (assegnazioneP()) {
                    System.out.println("Pentagono");
                    Pentagono t1 = new Pentagono(lato1, lato2, lato3, lato4, lato5);
                    System.out.println("L'area è di : " + t1.cercaArea());
                    System.out.println("Il perimetro è di : " + t1.cercaPerimetro());
                } else {
                    System.out.println("Errore dati inseriti!");
                }
                break;
        }

    }

    private boolean controllo(int i) {
        if (i <= 0 || i == 1 || i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            return true;
        }
        if (i == 5) {

            return true;
        }
        return false;
    }

    private boolean assegnazioneP() {
        try {
            System.out.println("Inserire lato 1:");
            this.lato1 = scan1.nextInt();
            System.out.println("Inserire lato 2:");
            this.lato2 = scan1.nextInt();
            System.out.println("Inserire lato 3:");
            this.lato3 = scan1.nextInt();
            System.out.println("Inserire lato 4:");
            this.lato4 = scan1.nextInt();
            System.out.println("Inserire lato 5:");
            this.lato5 = scan1.nextInt();

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean assegazioneQ() {
        try {
            System.out.println("Inserire lato 1:");
            this.lato1 = scan1.nextInt();
            System.out.println("Inserire lato 2:");
            this.lato2 = scan1.nextInt();
            System.out.println("Inserire lato 3:");
            this.lato3 = scan1.nextInt();
            System.out.println("Inserire lato 4:");
            this.lato4 = scan1.nextInt();

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean assegnazioneT() {
        try {
            System.out.println("Inserire lato 1:");
            this.lato1 = scan1.nextInt();
            System.out.println("Inserire lato 2:");
            this.lato2 = scan1.nextInt();
            System.out.println("Inserire lato 3:");
            this.lato3 = scan1.nextInt();

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private int controllolatiTriangolo() {
        if (lato1 == lato2 && lato2 == lato3) {
            return 1;
        }
        return 2;
    }

    private int controllolatiQuadrato() {
        if (lato1 == lato2 && lato2 == lato3 && lato3 == lato4) {
            return 1;
        }
        if (lato1 == lato3 || lato1 == lato4) {
            return 2;
        }
        return 3;
    }

}
