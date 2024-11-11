package Objeto_geometrico_guilherme;

public class Circunferencia extends ObjetoGeometrico {
    private double pi = 3.141618;
    private double raio;
    
    Circunferencia(double r) {
        raio = r;
    }
    
    public double getArea() {
        area = pi * (raio * raio);
        return area;
    }
    
    public double getPerimetro() {
        perimetro = 2 * pi * raio;
        return perimetro;
    }
}