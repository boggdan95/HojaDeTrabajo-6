import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ManejadorDeListas {
	
	private Set<String> listaDesarrolladoresJava;
	private Set<String> listaDesarrolladoresWeb;
	private Set<String> listaDesarrolladoresCelular;
	private int mayor=-1;
	public ManejadorDeListas() {
		
	}
	public void seleccionarTipoDeLista(int metodo){
		switch(metodo){
			case 1:
				listaDesarrolladoresJava= new HashSet<String>();
				listaDesarrolladoresWeb= new HashSet<String>();
				listaDesarrolladoresCelular= new HashSet<String>();
			break;
				
			case 2:
				listaDesarrolladoresJava= new TreeSet<String>();
				listaDesarrolladoresWeb= new TreeSet<String>();
				listaDesarrolladoresCelular= new TreeSet<String>();
			break;
			
			case 3:
				listaDesarrolladoresJava= new LinkedHashSet<String>();
				listaDesarrolladoresWeb= new LinkedHashSet<String>();
				listaDesarrolladoresCelular= new LinkedHashSet<String>();
			break;
			
		}
	}
	public void agregarDesarrolladores(String desarrolladores, boolean java, boolean web, boolean celular){
	     String[] desarrolladoresSeparados = desarrolladores.split("\\n");
	     System.out.println(java);
	     for (int i=0; i<desarrolladoresSeparados.length; i++){
	    	if(java)
	    		listaDesarrolladoresJava.add(desarrolladoresSeparados[i]);
	    	if(web)
	    		listaDesarrolladoresWeb.add(desarrolladoresSeparados[i]);
	    	if(celular)
	    		listaDesarrolladoresCelular.add(desarrolladoresSeparados[i]);
	     }
	     System.out.println(listaDesarrolladoresJava.size());
	     System.out.println(listaDesarrolladoresWeb.size());
	     System.out.println(listaDesarrolladoresCelular.size());
	}
	public String consultarDesarrolladores(boolean java, boolean web, boolean celular){
		String consulta="Los desarrolladores son";
		
		boolean bandera=true;
		TreeSet<String> lista = new TreeSet<String>();
		if(java){
			for(String desarrollador: listaDesarrolladoresJava){
				if(!lista.contains(desarrollador))
					lista.add(desarrollador);
			}
		}
		if(web){
			for(String desarrollador: listaDesarrolladoresWeb){
				if(!lista.contains(desarrollador))
					lista.add(desarrollador);
			}
		}
		if(celular){
			for(String desarrollador: listaDesarrolladoresCelular){
				if(!lista.contains(desarrollador))
					lista.add(desarrollador);
			}
		}
		for(String desarrollador: lista){
			consulta=consulta+"\n"+desarrollador;
		}
		return consulta;
	}
	public boolean esSubconjunto(){
		if(listaDesarrolladoresJava.size()<=listaDesarrolladoresWeb.size()){
			for(String desarrollador: listaDesarrolladoresJava){
				if(!listaDesarrolladoresWeb.contains(desarrollador))
					return false;
			}
			return true;
		}else{
			return false;
		}
	}
	public int seleccionarConjuntoMayor(){
		if(listaDesarrolladoresJava.size()>listaDesarrolladoresWeb.size() && listaDesarrolladoresJava.size()>listaDesarrolladoresCelular.size()){
			mayor=1;
		}else if(listaDesarrolladoresWeb.size()>listaDesarrolladoresJava.size() && listaDesarrolladoresWeb.size()>listaDesarrolladoresCelular.size()){
			mayor=2;
		}else if(listaDesarrolladoresCelular.size()>listaDesarrolladoresWeb.size() && listaDesarrolladoresCelular.size()>listaDesarrolladoresJava.size()){
			mayor = 3;
		}else{
			mayor=-1;
		}
		return mayor;
	}
	
}