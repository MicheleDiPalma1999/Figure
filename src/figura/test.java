package figura;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class test {

    int lato1 = 0;
    int lato2 = 0;
    int lato3 = 0;
    int lato4 = 0;
    int lato5 = 0;
    int lato6 = 0;
    Scanner scan1 = new Scanner(System.in);

    public void test() {
        int tmp = 0;
        String msg = "Quanti lati inserire? [3 - 4 - 5 - 6]";
        String scelta = JOptionPane.showInputDialog(msg);

        try {
            tmp = Integer.parseInt(scelta);
        } catch (Exception e) {
            System.out.println("Stampa errore: " + e.getMessage());
        }

        switch (tmp) {
            case 3:
                if (assegnazioneT()) {
                    if (controllolatiTriangolo() == 1) {
                        System.out.println("Triangolo equilatero");
                        TriangoloEquilatero t1 = new TriangoloEquilatero(lato1, lato2, lato3);
                        System.out.println("L'area è di : " + t1.cercaArea());
                        System.out.println("Il perimetro : " + t1.cercaPerimetro());

                    } else if (controllolatiTriangolo() == 2 && controlloScaleno()) {
                        System.out.println("Triangolo scaleno");
                        TriangoloScaleno t1 = new TriangoloScaleno(lato1, lato2, lato3);
                        System.out.println("L'area è di : " + t1.cercaArea());
                        System.out.println("Il perimetro : " + t1.cercaPerimetro());
                    } else {
                        System.out.println("Non è un triangolo!");
                    }
                } else {
                    System.out.println("Non è un triangolo!");
                }
                break;
            case 4:
                if (assegazioneQ()) {
                    switch (controllolatiQuadrato()) {
                        case 1: {
                            System.out.println("Quadrato");
                            Quadrato t1 = new Quadrato(lato1, lato2, lato3, lato4);
                            System.out.println("L'area è di : " + t1.cercaArea());
                            System.out.println("Il perimetro : " + t1.cercaPerimetro());
                            stampaQuadrilatero();
                            break;
                        }
                        case 2: {
                            System.out.println("Rettangolo");
                            Rettangolo t1 = new Rettangolo(lato1, lato2, lato3, lato4);
                            System.out.println("L'area è di : " + t1.cercaArea());
                            System.out.println("Il perimetro : " + t1.cercaPerimetro());
                            stampaQuadrilatero();
                            break;
                        }
                        default:
                            System.out.println("Non è un rettangolo!");
                            break;
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

            case 6:
                if (assegnazioneE()) {
                    System.out.println("Esagono");
                    esagono t1 = new esagono(lato1, lato2, lato3, lato4, lato5, lato6);
                    System.out.println("L'area è di : " + t1.cercaArea());
                    System.out.println("Il perimetro è di : " + t1.cercaPerimetro());
                } else {
                    System.out.println("Errore dati inseriti!");
                }
                break;
        }

    }

    public void stampaQuadrilatero() {
        JFrame frame = new JFrame("Il mio bersaglio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JBersaglio panel = new JBersaglio(lato1, lato2, lato3, lato4);
        frame.getContentPane().add(panel);
        frame.pack();           // aggiusta il laytout e le dimensioni prefissate 
        frame.setVisible(true);
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

    public boolean controlloQuadrato(int a, int b, int c, int d) {
        if (a + b == c + d) {
            return true;
        } else {
            return false;
        }

    }

    private boolean assegnazioneE() {
        if (assegnazioneP()) {
            String str = "Inserire lato 6:";
            String scelta = JOptionPane.showInputDialog(str);
            try {
                lato5 = Integer.parseInt(scelta);
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }

        return true;
    }

    private boolean assegnazioneP() {
        if (assegazioneQ()) {
            String str = "Inserire lato 5:";
            String scelta = JOptionPane.showInputDialog(str);
            try {
                lato5 = Integer.parseInt(scelta);
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    private boolean assegazioneQ() {
        if (assegnazioneT()) {
            String str = "Inserire lato 4:";
            String scelta = JOptionPane.showInputDialog(str);
            try {
                lato4 = Integer.parseInt(scelta);
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    private boolean assegnazioneT() {

        String str = "Inserire lato 1:";
        String scelta = JOptionPane.showInputDialog(str);
        try {
            lato1 = Integer.parseInt(scelta);
        } catch (Exception e) {
            return false;
        }

        str = "Inserire lato 2:";
        scelta = JOptionPane.showInputDialog(str);
        try {
            lato2 = Integer.parseInt(scelta);
        } catch (Exception e) {
            return false;
        }
        str = "Inserire lato 3:";
        scelta = JOptionPane.showInputDialog(str);
        try {
            lato3 = Integer.parseInt(scelta);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    private int controllolatiTriangolo() {
        if (lato1 == lato2 && lato2 == lato3) {
            return 1;
        } else if (lato1 != lato2 && lato2 != lato3) {
            return 2;
        }
        return 3;
    }

    private boolean controlloScaleno() {
        if ((lato1 + lato2) > lato3 && (lato1 + lato3) > lato2 && (lato2 + lato3) > lato1) {
            return true;
        }
        return false;
    }

    private int controllolatiQuadrato() {
        if (lato1 == lato2 && lato2 == lato3 && lato3 == lato4) {
            return 1;
        }
        if ((lato1 == lato3 || lato1 == lato2 || lato1 == lato4) && (lato2 == lato1 || lato2 == lato3 || lato2 == lato4)) {
            return 2;
        }
        return 3;
    }

}
