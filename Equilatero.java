
package poligono;

    public class Equilatero extends Triangulo{
    private double area;
    private double perimetro;

    
    public double calculaArea(){
        return area=(this.lados[2]*this.lados[1]*1.73)/4;
    }
    public double calculaPerimetro(){
        return perimetro=this.lados[0]+this.lados[1]+this.lados[2];
        
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void mostrarAtributos(){
        System.out.println("");
        System.out.println("Triangulo Equilatero:");
        System.out.println("Area do Triangulo Equilatero = "+getArea());
        System.out.println("Perimetro do Triangulo Equilatero é = "+getPerimetro());
        System.out.println("____________________________________");
    }
    
}
