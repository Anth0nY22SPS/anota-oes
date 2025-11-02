/* 
Definição: Abstração consiste em esconder os detalhes de implementação e expor apenas o que é 
essencial para o uso de um objeto. Em Java, isso é feito principalmente com classes abstratas 
e interfaces.
*/

public abstract class Veiculo {
    public abstract void acelerar(); // método abstrato

    public void ligarMotor() {
        System.out.println("Motor ligado");
    }
}

public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }
}

🚗 A classe Veiculo define o que todo veículo deve fazer (acelerar), mas não como. A classe Carro implementa esse comportamento.

📦 Exemplo com interface

java

public interface Forma {
    double calcularArea();
}

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}