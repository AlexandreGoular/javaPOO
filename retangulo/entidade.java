package retangulo;

public class entidade {
    public double largura;
    public double altura;

    public double areaRetangulo() {
        double area = (largura * altura);

        return area;
    }

    public double perimetroRetangulo() {
        double perimetro = 2 * (largura + altura);

        return perimetro;
    }

    public double diagonalRetangulo() {
        double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));

        return diagonal;
    }
}