/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooComposicao;

/**
 *
 * @author Dalvana
 */

// Mesmo pacote da classe Motor.

public class Carro {
    // Classe Carro representa um carro completo,
    // que é composto por UM motor (reuso via COMPOSIÇÃO).

    final Motor motor;
    // O Carro TEM UM Motor.
    // 'final' garante que, depois de criado no construtor,
    // não trocaremos esse motor por outro (não faz "swap" de motor).
    // Isso reforça a ideia de composição forte.

    Carro() {
        // Construtor do Carro. Chamado quando fazemos new Carro().

        this.motor = new Motor(this);
        // Ao criar o Carro, ele também cria o seu Motor.
        // Passa 'this' (o próprio Carro) para o construtor do Motor,
        // permitindo que o Motor saiba quem é o seu "dono".
        // Isso cria uma relação bidirecional Carro ↔ Motor.
    }

    void acelerar() {
        // Método que simula o ato de acelerar o carro.

        if (motor.fatorInjecao < 2.6) {
            // Verifica se o fator de injeção ainda não chegou ao limite máximo (2.6).

            motor.fatorInjecao += 0.4;
            // Aumenta o fator de injeção em 0.4.
            // Isso fará o motor girar mais quando chamarmos giros().
        }
    }

    void frear() {
        // Método que simula o ato de frear o carro.

        if (motor.fatorInjecao > 0.5) {
            // Garante que o fator de injeção não fique abaixo de um limite mínimo (0.5).

            motor.fatorInjecao -= 0.4;
            // Diminui o fator de injeção em 0.4.
            // Isso reduz a rotação do motor.
        }
    }

    void ligar() {
        // Liga o carro.

        motor.ligado = true;
        // Na prática, ligar o carro significa ligar o motor.
        // Muda o estado do motor para ligado (true).
    }

    void desligar() {
        // Desliga o carro.

        motor.ligado = false;
        // Desligar o carro significa desligar o motor.
        // Muda o estado do motor para desligado (false).
    }

    boolean estaLigado() {
        // Método que informa se o carro está ligado ou não.

        return motor.ligado;
        // O estado "ligado" do carro depende diretamente do estado do motor.
        // Não há um 'ligado' separado no Carro, ele consulta o Motor.
    }
}
