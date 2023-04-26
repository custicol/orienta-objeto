package orientaçãoobjeto;

public class Cliente {
	
	private float altura;
	private String cpf;
	private String nome;
	private float salario;
	private int idade;
	
	
	public Cliente(float altura, String cpf, String nome, float salario, int idade) {
		super();
		this.altura = altura;
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.idade = idade;
		
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	
	public void visualiza() {
		System.out.println ("Cliente [altura=" + altura + ", cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + ", idade="
				+ idade + "]");
	}
	
	
	
	
}
