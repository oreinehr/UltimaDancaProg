package Aula31.ExemploAbstrato;

public class Retangulo extends Figura {
    private double base;
    private double altura;

    public Retangulo(){
        setNomeFigura("Retângulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
        return base * altura; // Corrigido: retorna o valor da área
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (base + altura); // Corrigido: retorna o valor do perímetro
    }
}
