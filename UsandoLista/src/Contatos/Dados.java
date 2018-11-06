package Contatos;

import java.util.ArrayList;


public class Dados {

	ArrayList<Contatos> Listcontatos = new ArrayList<Contatos>();
	
	
	public void CadastraContato(Contatos contato) {
		Listcontatos.add(contato);
	}
	
	public int NumeroContatos() {
		
		return Listcontatos.size();
	}
	
	public ArrayList<Contatos> RetornaContatos(){
		return Listcontatos;
		
	}
	
	public Integer RetornaID(Integer ID) {
		
		for (Contatos contatos : Listcontatos) {
			
			if(contatos.getId() == ID)
			{
				return contatos.getId();
			}	
		}
		
		return 0;
	}
	public String RetornaNome(Integer ID) {
		
		for (Contatos contatos : Listcontatos) {
			
			if(contatos.getId() == ID)
			{
				return contatos.getNome();
			}	
		}
		
		return "";
	}
	public String RetornaEmail(Integer ID) {
		
		for (Contatos contatos : Listcontatos) {
			
			if(contatos.getId() == ID)
			{
				return contatos.getEmail();
			}	
		}
		
		return "";
	}
	public String RetornaCelular(Integer ID) {
		
		for (Contatos contatos : Listcontatos) {
			
			if(contatos.getId() == ID)
			{
				return contatos.getCelular();
			}	
		}
		
		return "";
	}
	
	public String RetornaCPF(Integer ID) {
		
		for (Contatos contatos : Listcontatos) {
			
			if(contatos.getId() == ID)
			{
				return contatos.getCpf();
			}	
		}
		
		return "";
	}
	public String RetornaRG(Integer ID) {
		
		for (Contatos contatos : Listcontatos) {
			
			if(contatos.getId() == ID)
			{
				return contatos.getRg();
			}	
		}
		
		return "";
	}
}
