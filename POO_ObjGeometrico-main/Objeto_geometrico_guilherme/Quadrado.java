package Objeto_geometrico_guilherme;

public class Quadrado extends ObjetoGeometrico {
    private double lado;
    
    Quadrado(double l) {
        lado = l;
    }
    
    public double getArea() {
        area = lado * lado;
        return area;
    }
    
    public double getPerimetro() {
        perimetro = 4 * lado; 
        return perimetro;
    }
}
