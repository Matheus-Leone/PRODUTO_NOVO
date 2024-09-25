package pacoteProduto2;

import java.time.LocalDate;

public class Main {

	// Método principal para testar o projeto
    public static void main(String[] args) {
        // Testando o primeiro construtor (todos os atributos)
    	produto_Novo p1 = new produto_Novo("Produto A", 100.0, 150.0, LocalDate.of(2023, 9, 1), LocalDate.of(2024, 9, 1));
        System.out.println(p1);

        // Testando o segundo construtor (sem data de validade)
        produto_Novo p2 = new produto_Novo("Produto B", 200.0, 250.0, LocalDate.of(2023, 8, 15));
        System.out.println("\n" + p2);

        // Testando o terceiro construtor (apenas nome e preço de custo)
        produto_Novo p3 = new produto_Novo("Produto C", 300.0);
        System.out.println("\n" + p3);
    }
}
