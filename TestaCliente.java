package orientaçãoobjeto;

import java.util.ArrayList;

public class TestaCliente {

	public static void main(String[] args) {
		
		ArrayList <Cliente> cl = new ArrayList<>();
		
		cl.add(new Cliente(1.71f,"400000","Jão",3000.00f,45));
		cl.add(new Cliente(1.65f,"500000","Pedrin",3500.00f,23));
		cl.add(new PessoaFisica(1.78f,"900000","Ronaldin",6300.00f,29,"ronaldin.soccer@hotmail.com"));
		cl.add(new PessoaFisica(1.45f,"300000","Flavin",1300.00f,21,"flavin-dupineu@gmail.com"));
		cl.add(new PessoaJuridica(1.82f,"100000","Castrin",31600.00f,37,"7890080"));
		cl.add(new PessoaJuridica(1.90f,"800000","Felipin",40800.00f,50,"7800080"));
		
		
		for (Cliente cliente : cl) {
			cliente.visualiza();
		}
		
		
		
	}

}
