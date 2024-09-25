package pacoteProduto2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

	public class produto_Novo {
		// Atributos privados por motivos de segurança
		private String nome;
		private double precoCusto;
		private double precoVenda;
		private LocalDate dataFabricacao;
		private LocalDate dataValidade;

    // Construtor que recebe todos os atributos por parâmetro
    public produto_Novo(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    // Construtor que recebe nome, preço de custo, preço de venda e data de fabricação, sendo a data de validade será 1 mês após a data de fabricação
    //ChronoUnits.Months faz o cálculo dos meses para saber a data de validade
    public produto_Novo(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);
    }

    // Construtor que recebe apenas nome e preço de custo |  Preço de venda será 10% a mais que o preço de custo | Data de validade será 1 mês após a data de fabricação
    public produto_Novo(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10;
        this.dataFabricacao = LocalDate.now();
        this.dataValidade = this.dataFabricacao.plus(1, ChronoUnit.MONTHS);
    }

    //Get para puxar os dados e enviá-los quando forem requisitados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método para exibir as informações do produto, o Método toString fornece uma descrição mais legível e informativa dos dados "printados"
    public String toString() {
        return "Produto: " + nome +
               "\nPreço de Custo: R$" + precoCusto +
               "\nPreço de Venda: R$" + precoVenda +
               "\nData de Fabricação: " + dataFabricacao +
               "\nData de Validade: " + dataValidade;
    }
}
   