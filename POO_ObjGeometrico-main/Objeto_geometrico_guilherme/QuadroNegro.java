package Objeto_geometrico_guilherme;

public class QuadroNegro {
    private Quadrado quadrado;
    private Retangulo retangulo;
    private Circunferencia circunferencia;
    private Triangulo triangulo;
    
    public void limpaQuadro() {
    }
    
    public void criaQuadrado(double l, String c) {
        quadrado = new Quadrado(l);
        quadrado.setCor(c);
    }
    
    public void criaRetangulo(double c, double a, String cor) {
        retangulo = new Retangulo(c, a);
        retangulo.setCor(cor);
    }
    
    public void criaCircunferencia(double r, String c) {
        circunferencia = new Circunferencia(r);
        circunferencia.setCor(c);
    }
    
    public void criaTriangulo(double b, double a, String c) {
        triangulo = new Triangulo(b, a);
        triangulo.setCor(c);
    }
    
    public void mostraAreaObjetos() {
        System.out.println("Quadrado. Área: " + quadrado.getArea());
        System.out.println("Retângulo. Área: " + retangulo.getArea());
        System.out.println("Triângulo. Área: " + triangulo.getArea());
        System.out.println("Circunferência. Área: " + circunferencia.getArea());
    }
    
    public void mostraPerimetroObjetos() {
        System.out.println("O perímetro dos objetos são:");
        System.out.println("> Quadrado: " + quadrado.getPerimetro());
        System.out.println("> Retangulo: " + retangulo.getPerimetro());
        System.out.println("> Triângulo: " + triangulo.getPerimetro());
        System.out.println("> Circunferência: " + circunferencia.getPerimetro());
    }
    
    public void mostraCorObjetos() {
        System.out.println("-------------------------------------------");
        System.out.println("A cor dos objetos são:");
        System.out.println("> Quadrado: " + quadrado.getCor());
        System.out.println("> Retangulo: " + retangulo.getCor());
        System.out.println("> Triângulo: " + triangulo.getCor());
        System.out.println("> Circunferência: " + circunferencia.getCor());
    }
    
    public static void main(String[] args) {
        QuadroNegro quadroNegro = new QuadroNegro();
        quadroNegro.criaQuadrado(12.625, "Branco");
        quadroNegro.criaRetangulo(50.5, 39.6, "Azul");
        quadroNegro.criaTriangulo(13.4, 5.5, "Amarelo");
        quadroNegro.criaCircunferencia(14, "Verde");
        quadroNegro.mostraPerimetroObjetos();
        quadroNegro.mostraCorObjetos();
    }
}
