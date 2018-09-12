
package poligono;

public class Teste {


    public static void main(String[] args) {
        
        Quadrado q1 = new Quadrado();
        q1.lados[0]=2;
        q1.lados[1]=2;
        q1.calculaArea();
        q1.calculaPerimetro();
        q1.mostrarAtributos();
        
        Retangulo r1 = new Retangulo();
        r1.lados[0]=3;
        r1.lados[1]=8;
        r1.calculaArea();
        r1.calculaPerimetro();
        r1.mostrarAtributos();
        
        Equilatero e1 = new Equilatero();
        e1.lados[0]=5;
        e1.lados[1]=5;
        e1.lados[2]=7;
        e1.calculaArea();
        e1.calculaPerimetro();
        e1.mostrarAtributos();
        
        Escaleno l1 = new Escaleno();
        l1.lados[0]=8;
        l1.lados[1]=12;
        l1.lados[2]=14;
        l1.calculaArea();
        l1.calculaPerimetro();
        l1.mostrarAtributos();
        
        TrianguloRetangulo t1 = new TrianguloRetangulo();
        t1.lados[0]=5;
        t1.lados[1]=7;
        t1.lados[2]=12;
        t1.calculaArea();
        t1.calculaPerimetro();
        t1.mostrarAtributos();
              
        
    }
    
}
