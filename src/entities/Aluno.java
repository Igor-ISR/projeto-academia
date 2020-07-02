package entities;

public class Aluno {

	
	private String name;
	private Integer idade;
	private String endereco;
	private String telefone;
	private String email;
	
	public Aluno() {
		
	}
	public Aluno(String name, Integer idade, String endereco, String telefone, String email) {
		
		
		this.name = name;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return ("Nome: " + this.name + "\nIdade: " + idade + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\ne-mail: " + email + "\n"); 
	}
 
}
