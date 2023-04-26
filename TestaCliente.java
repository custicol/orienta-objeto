package orientaçãoobjeto;

import java.util.ArrayList;

public class TestaCliente {

	public static void main(String[] args) {
		
		ArrayList <Cliente> cl = new ArrayList<>();
		
		cl.add(new Cliente(1.71f,"400000","Jão",3000.00f,45));
		cl.add(new Cliente(1.65f,"500000","Pedrin",3500.00f,23));
		
		for (Cliente cliente : cl) {
			cliente.visualiza();
		}
		
		
		
	}

}
