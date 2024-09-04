package Aula31.ExemploAbstrato;

public class Circulo extends Figura{
    private double raio;

    public Circulo(){
        setNomeFigura("Círculo");
    }
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calculaArea() {
        return 0;
    }

    @Override
    public double calculaPerimetro() {
        return 0;
    }
}
