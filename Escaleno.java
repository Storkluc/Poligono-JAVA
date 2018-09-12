package poligono;

    public class Escaleno extends Triangulo{
    private double area;
    private double perimetro;

    
    public double calculaPerimetro(){
    return perimetro=(this.lados[0]+this.lados[1]+this.lados[2])/2;
        
    }
    public double calculaArea(){
        return area=(perimetro*(java.lang.Math.sqrt(perimetro-this.lados[0])*(perimetro-this.lados[1])*(perimetro-this.lados[2])));
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void mostrarAtributos(){
        System.out.println("");
        System.out.println("Triangulo Escaleno:");
        System.out.println("Area do Triangulo Escaleno = "+getArea());
        System.out.println("Perimetro do Triangulo Escaleno é = "+getPerimetro());
        System.out.println("____________________________________");
    }
    
}