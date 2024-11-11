package Objeto_geometrico_guilherme;

abstract public class ObjetoGeometrico {
    public double area;
    public double perimetro;
    protected String cor;
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String c) {
        cor = c;
    }
}
