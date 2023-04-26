package orientaçãoobjeto;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(float altura, String cpf, String nome, float salario, int idade, String cnpj) {
		super(altura, cpf, nome, salario, idade);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualiza() {
		System.out.println ("Cliente [altura=" + getAltura() + ", cpf=" + getCpf() + ", nome=" + getNome() + ", salario=" + getSalario() + ", idade="
				+ getIdade() + "cnpj=" + cnpj + "]");
	
	
}

	
	}
