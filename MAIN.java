package FigurasGeometricas;

public class MAIN {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(2.0);
        Circulo circulo = new Circulo(3.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 5.0);
        Triangulo triangulo = new Triangulo(3.0, 4.0);

        System.out.println("Área del cuadrado: " + cuadrado.getArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.getPerimetro());

        System.out.println("Área del círculo: " + circulo.getArea());
        System.out.println("Perímetro del círculo: " + circulo.getPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());

        System.out.println("Área del triángulo: " + triangulo.getArea());
        System.out.println("Perímetro del triángulo: " + triangulo.getPerimetro());
    }
}
