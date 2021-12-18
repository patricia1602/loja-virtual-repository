package br.com.alura.jdbc.modelo;

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;

	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return null;
	}

	public String getDescricao() {
		return null;
	}

	public void setId(int int1) {

	}

	@Override
	public String toString() {
		return String.format("O produto criado foi: %d, %s, %s", this.id, this.nome, this.descricao);
	}

}
