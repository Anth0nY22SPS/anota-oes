// Herança permite que uma classe herde atributos e métodos de outra classe

public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

// extends serve para  
public class Cachorro extends Animal {
    
    @Override  // @Override -> serve para sobre escrever o metodo 
    public void emitirSom() {
        System.out.println("Au au!");
    }
}