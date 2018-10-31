/**
 * 
 */
package Console;

import java.util.ArrayList;

import Contatos.Contatos;

/**
 * @author Jorge Hernandes
 *
 */
public class inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Contatos> Listcontatos = new ArrayList<Contatos>();
		
		Contatos contato = new Contatos("Jorge", "jorge.hernandes", "99999999");
		Contatos contato1 = new Contatos("Miguel", "Miguel@gmail.com", "123456789");
		Contatos contato2 = new Contatos("Carvalho", "Carvalho@gmail.com", "987654321");
		Contatos contato3 = new Contatos("Hernandes", "Hernandes@gmail.com", "1011121314");
		
		Listcontatos.add(contato);
		Listcontatos.add(contato1);
		Listcontatos.add(contato2);
		Listcontatos.add(contato3);
		
		
		for (Contatos impcontato : Listcontatos) {
			System.out.println(impcontato);
		}
		
		
		
		
	}
}
