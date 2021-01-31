package VO;

import java.text.SimpleDateFormat;
import java.util.Date;
import validacao.ClienteValid;

public class ClienteVO {
	ClienteValid valid = new ClienteValid();
	
	private String nome;
	private String endereco;
	private Integer cep;
	private Date nasci;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public Date getNasci() {
		return nasci;
	}
	public void setNasci(String nasci) {
	String regex = valid.getDateRegexFormat();
	Date nasciDate = new Date(); 
	
	if(nasci.matches(regex)) {
		try {
			nasciDate = new SimpleDateFormat("dd/MM/yyyy").parse(nasci);
		}catch(Exception e) {
			System.out.println("Exception error: " + e.toString());
		}
	}else {
		System.out.println("Invalid Date Format");
	}
	
	this.nasci = nasciDate;
	
}}
