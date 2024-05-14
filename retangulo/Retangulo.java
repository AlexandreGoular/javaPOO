package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        entidade objeto = new entidade();

        System.out.println("Digite a altura e largura do retangulo");
        objeto.altura = input.nextDouble();
        objeto.largura = input.nextDouble();

        double area;
        double perimetro;
        double diagonal;

        area = objeto.areaRetangulo();
        perimetro = objeto.perimetroRetangulo();
        diagonal = objeto.diagonalRetangulo();

        System.out.printf("AREA = %.2f \n", area);
        System.out.printf("PERIMETRO = %.2f \n", perimetro);
        System.out.printf("DIAGONAL = %.2f", diagonal);

        input.close();
    }
}