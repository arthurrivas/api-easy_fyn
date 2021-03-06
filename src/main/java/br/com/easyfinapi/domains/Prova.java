package br.com.easyfinapi.domains;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Prova {

	@Id
	private String id;
	private String titulo;
	
//	private Date dataInicio;
//	private Date dataLimite;
	
	private String idProfessorCriador;
	
	
	private List<Questao> listaQuestoes = new ArrayList<>();
	
	
	public Prova() {
	}

	
	public Prova(String id, String titulo, List<Questao> listaQuestoes, String idProfessor) {
		this.id = id;
		this.titulo = titulo;
		this.listaQuestoes = listaQuestoes;
		this.idProfessorCriador = idProfessor;
	}


	public void adicionaQuestao(Questao questao) {
		this.listaQuestoes.add(questao);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public String getIdProfessorCriador() {
		return idProfessorCriador;
	}


	public void setIdProfessorCriador(String idProfessorCriador) {
		this.idProfessorCriador = idProfessorCriador;
	}


	public List<Questao> getListaQuestoes() {
		return listaQuestoes;
	}

	public void setListaQuestoes(List<Questao> listaQuestoes) {
		this.listaQuestoes = listaQuestoes;
	}
	
	
}
