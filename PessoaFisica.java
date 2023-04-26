package orientaçãoobjeto;

public class PessoaFisica extends Cliente {

	private String email;

	public PessoaFisica(float altura, String cpf, String nome, float salario, int idade, String email) {
		super(altura, cpf, nome, salario, idade);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void visualiza() {
		System.out.println("Cliente [altura=" + getAltura() + ", cpf=" + getCpf() + ", nome=" + getNome() + ", salario=" + getSalario()
				+ ", idade=" + getIdade() + "email=" + email + "]");
	}

}
