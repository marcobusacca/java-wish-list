package org.lessons.java.christmas.pojo;

public class Regalo {

	private String nome;
	private String destinatario;
	
	
	public Regalo(String nome, String destinatario) {
		
		setNome(nome);
		setDestinatario(destinatario);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	@Override
	public String toString() {
		
		return 	"\n----------------------\n"
				+ "Regalo\n"
				+ "\nNome: " + getNome()
				+ "\nDestinatario: " + getDestinatario()
				+ "\n----------------------";
	}
}
