package online.corsojava.phonebook.model;

public class Contact {
	
	String nome, cognome, numero;

	public Contact(String nome, String cognome, String numero) {

		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}

	public Contact() {

	}
	
	
	@Override
	public String toString() {
		return "Contact [nome=" + nome + ", cognome=" + cognome + ", numero=" + numero + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


	

}
