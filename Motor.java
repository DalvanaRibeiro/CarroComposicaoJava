/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooComposicao;

/**
 *
 * @author Dalvana
*/

public class Motor {
    // Classe Motor representa o motor de um carro.
    // Ela não faz sentido sozinha: sempre pertence a um Carro (composição).
    
/////////////////////////DEPOIS DE CARRO /////////////////////////////////////////////////////////////
    final Carro carro;
    // Referência para o Carro ao qual este Motor pertence.
    // 'final' significa que, depois que for atribuída no construtor,
    // essa variável não pode apontar para outro Carro.
    // Ou seja, este motor sempre será deste carro → composição forte.
/////////////////////////DEPOIS DE CARRO /////////////////////////////////////////////////////////////
    boolean ligado = false;
    // Indica se o motor está ligado ou desligado.
    // Começa desligado (false) por padrão.

    double fatorInjecao = 1;

    
    // Representa a quantidade de combustível sendo injetada.
    // Esse valor será usado para calcular os "giros" do motor.
    // Quanto maior o fator, maior a rotação.
/////////////////////////DEPOIS DE CARRO /////////////////////////////////////////////////////////////
    Motor(Carro carro) {
        // Construtor do Motor. Recebe um objeto Carro como parâmetro.

        this.carro = carro;
        // 'this.carro' (atributo da classe) recebe o 'carro' passado no construtor.
        // Com isso, o Motor sabe a qual Carro ele pertence.
    }
/////////////////////////DEPOIS DE CARRO /////////////////////////////////////////////////////////////
    int giros() {
        // Método que calcula e retorna a rotação (RPM) do motor.

        if (!ligado) {
            // Se o motor NÃO estiver ligado...

            return 0;
            // Não há giros. Motor desligado → 0 RPM.
        } else {
            // Se o motor estiver ligado...

            return (int) Math.round(fatorInjecao * 3000);
            // Calcula os giros multiplicando o fator de injeção por 3000.
            // Math.round(...) arredonda o valor para o inteiro mais próximo.
            // O resultado é convertido para int.
        }
    }
}
