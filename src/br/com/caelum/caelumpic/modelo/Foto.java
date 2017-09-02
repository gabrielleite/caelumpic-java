package br.com.caelum.caelumpic.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="fotos")
public class Foto {
	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String descricao;
	private String endereco;
	
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
