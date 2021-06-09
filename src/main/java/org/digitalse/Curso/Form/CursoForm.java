package org.digitalse.Curso.Form;

import java.util.Date;

import org.digitalse.Curso.entity.Curso;
import org.digitalse.Curso.repository.CursoRepository;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CursoForm {
	private String nome;
	private String descricao;
	private String emanta;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataCadastro;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataInicio;
	private float valor;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEmanta() {
		return emanta;
	}

	public void setEmanta(String emanta) {
		this.emanta = emanta;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public Curso converter() {
		return new Curso(nome, descricao, emanta, dataCadastro, dataInicio, valor);
	}
	

}
