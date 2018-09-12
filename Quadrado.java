
package poligono;

public class Quadrado extends Poligono{
    private double area;
    private double perimetro;

    
    public double calculaArea(){
        return area=this.lados[0]*this.lados[1];
    }
    public double calculaPerimetro(){
        return perimetro=this.lados[0]*4;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void mostrarAtributos(){
        System.out.println("_____________Poligonos_____________");
        System.out.println("");
        System.out.println("Quadrado:");
        System.out.println("Area do Quadrado = "+getArea());
        System.out.println("Perimetro do Quadrado é = "+getPerimetro());
        System.out.println("____________________________________");
    }
    
    
    
}
