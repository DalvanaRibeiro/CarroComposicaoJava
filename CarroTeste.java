/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooComposicao;

/**
 *
 * @author Dalvana
 */
public class CarroTestee {
 
    // Classe de teste. Contém o método main para executar o programa.

    public static void main(String[] args) {
        // Ponto de entrada da aplicação Java.

        Carro c1 = new Carro();
        // Cria um novo objeto Carro.
        // Dentro do construtor do Carro, também será criado um Motor associado a ele.

        System.out.println(c1.estaLigado());
        // Imprime se o carro está ligado.
        // Como o motor começa desligado, o resultado esperado é: false.

        c1.ligar();
        // Chama o método ligar() do Carro,
        // que internamente configura motor.ligado = true.

        System.out.println(c1.estaLigado());
        // Agora deve imprimir true, pois o motor foi ligado.

        System.out.println(c1.motor.giros());
     

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
      

        System.out.println(c1.motor.giros());
   
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
       
        System.out.println(c1.motor.giros());
      

    }
}
  
