package br.com.caelum.caelumpic.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/* Anota��o @Entity indica que essa classe representa uma tabela no BD.
 * Anota��o @Table possibilita um ajuste fino entre a tabela do BD e a classe Java.
 */
@Entity
@Table(name="fotos")
public class Foto {
	/* Anota��o @Id indica que esse atributo representa a chave prim�ria da tabela no BD.
	 * Anota��o @GeneratedValue define a forma de gera��o do valor da chave prim�ria.
	 * O valor � delegar ao BD a gera��o.
	 */
	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String descricao;
	private String endereco;
	
	/* Anota��o @Temporal indica o tipo de dado usado no BD para representar uma
	 * medida de tempo.
	 */
	@Temporal(TemporalType.DATE)
	private Calendar dataCricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Calendar getDataCricao() {
		return dataCricao;
	}
	public void setDataCricao(Calendar dataCricao) {
		this.dataCricao = dataCricao;
	}
}
