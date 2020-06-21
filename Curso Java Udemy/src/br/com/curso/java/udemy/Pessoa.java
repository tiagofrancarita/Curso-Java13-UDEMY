package br.com.curso.java.udemy;

public class Pessoa {
	
	private String matricula;
	private String cpf;
	private String dtNasc;
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		
			
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	@Override
	public String toString() {
		return "Pessoa [matricula=" + matricula + ", cpf=" + cpf + ", dtNasc=" + dtNasc + "]";
	}
	
	

}
