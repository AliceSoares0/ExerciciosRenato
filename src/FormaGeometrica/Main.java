package FormaGeometrica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FormaGeometricaAbstract formaGeometrica1 = new Quadrado(2);
        FormaGeometricaAbstract formaGeometrica2 = new Circulo(5);

        ArrayList<FormaGeometricaAbstract> fgs = new ArrayList<>();
        fgs.add(formaGeometrica1);
        fgs.add(formaGeometrica2);

        for (FormaGeometricaAbstract fg : fgs) {
            System.out.println(fg.area());
            System.out.println(fg.comprimento());
        }
    }
}
