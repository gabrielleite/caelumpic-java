package br.com.caelum.caelumpic.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/* Anotacao @Entity indica que essa classe representa uma tabela no BD.
 * Anotacao @Table possibilita um ajuste fino entre a tabela do BD e a classe Java.
 */
@Entity
@Table(name="fotos")
public class Foto {
	/* Anotacao @Id indica que esse atributo representa a chave primaria da tabela no BD.
	 * Anotacao @GeneratedValue define a forma de geracao do valor da chave primaria.
	 * O valor eh delegar ao BD a geracao.
	 */
	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String descricao;
	private String endereco;
	
	/* Anotacao @Temporal indica o tipo de dado usado no BD para representar uma
	 * medida de tempo.
	 */
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Calendar dataCriacao;
	
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
	public Calendar getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
