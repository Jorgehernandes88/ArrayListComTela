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
		
		Contatos contato = new Contatos(1,"Jorge", "jorge.hernandes", "99999999","07121888988","98565888");
		Contatos contato1 = new Contatos(2,"Miguel", "Miguel@gmail.com", "123456789","07121888988","98565888");
		Contatos contato2 = new Contatos(3,"Carvalho", "Carvalho@gmail.com", "987654321","07121888988","98565888");
		Contatos contato3 = new Contatos(4,"Hernandes", "Hernandes@gmail.com", "1011121314","07121888988","98565888");
		
		Listcontatos.add(contato);
		Listcontatos.add(contato1);
		Listcontatos.add(contato2);
		Listcontatos.add(contato3);
		
		
		for (Contatos impcontato : Listcontatos) {
			System.out.println(impcontato);
		}
			
	}
}
