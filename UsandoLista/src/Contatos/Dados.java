package Contatos;

import java.util.ArrayList;

public class Dados {

	ArrayList<Contatos> Listcontatos = new ArrayList<Contatos>();
	
	
	public void CadastraContato(Contatos contato) {
		Listcontatos.add(contato);
	}
	
	public String NumeroContatos() {
		
		return Listcontatos.size() + " Contatos cadastrados";
	}
	
	public ArrayList<Contatos> RetornaContatos(){
		return Listcontatos;
		
	}
}
