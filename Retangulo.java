
package poligono;

    public class Retangulo extends Poligono{
    private double area;
    private double perimetro;

    
    public double calculaArea(){
        return area=this.lados[0]*this.lados[1];
    }
    public double calculaPerimetro(){
        return perimetro=this.lados[0]*2+this.lados[1]*2;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void mostrarAtributos(){
        System.out.println("");
        System.out.println("Retangulo:");
        System.out.println("Area do Retangulo = "+getArea());
        System.out.println("Perimetro do Retangulo é = "+getPerimetro());
        System.out.println("____________________________________");
    }
}