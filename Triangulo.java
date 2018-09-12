
package poligono;

public abstract class Triangulo extends Poligono{
    @Override
    public double[] getLados() {
    return lados;
}

    @Override
    public void setLados(double[] lados) {
    this.lados = lados;
}
}
