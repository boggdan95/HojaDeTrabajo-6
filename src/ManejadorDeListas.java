import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Boggdan Barrientos, Rudy Garrido
 * @03 de septiembre de 2015
 * @Hoja de trabajo # 6
 */


// TODO: Auto-generated Javadoc
/**
 * The Class ManejadorDeListas.
 */
public class ManejadorDeListas {
	
	/** The lista desarrolladores java. */
	private Set<String> listaDesarrolladoresJava;
	
	/** The lista desarrolladores web. */
	private Set<String> listaDesarrolladoresWeb;
	
	/** The lista desarrolladores celular. */
	private Set<String> listaDesarrolladoresCelular;
	
	/** The mayor. */
	private int mayor=-1;
	
	/**
	 * Instantiates a new manejador de listas.
	 */
	public ManejadorDeListas() {
		
	}
	
	/**
	 * Seleccionar tipo de lista.
	 *
	 * @param metodo the metodo
	 */
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
	
	/**
	 * Agregar desarrolladores.
	 *
	 * @param desarrolladores the desarrolladores
	 * @param java the java
	 * @param web the web
	 * @param celular the celular
	 */
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
	
	/**
	 * Consultar desarrolladores.
	 *
	 * @param java the java
	 * @param web the web
	 * @param celular the celular
	 * @return the string
	 */
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
	
	/**
	 * Es subconjunto.
	 *
	 * @return true, if successful
	 */
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
	
	/**
	 * Seleccionar conjunto mayor.
	 *
	 * @return the int
	 */
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
	
	/**
	 * Consultar conjunto mayor.
	 *
	 * @return the string
	 */
	public String consultarConjuntoMayor(){
		String consulta="Los desarrolladores son";
		ArrayList<String> listaOrdenada;
		switch(mayor){
			case 1:
				listaOrdenada= new ArrayList<String>(listaDesarrolladoresJava);
				Collections.sort(listaOrdenada);
				for(String desarrollador: listaOrdenada){
						consulta=consulta+"\n"+desarrollador;
				}
				return consulta;
			case 2:
				listaOrdenada= new ArrayList<String>(listaDesarrolladoresWeb);
				Collections.sort(listaOrdenada);
				for(String desarrollador: listaOrdenada){
					consulta=consulta+"\n"+desarrollador;
				}
			return consulta;
			case 3:
				listaOrdenada= new ArrayList<String>(listaDesarrolladoresCelular);
				Collections.sort(listaOrdenada);
				for(String desarrollador: listaOrdenada){
					consulta=consulta+"\n"+desarrollador;
				}
			default:
				return "No existe un conjunto con tamaño \n mayor que el resto";
		}
	}
	
	/**
	 * Obtener java sin web.
	 *
	 * @return the string
	 */
	public String obtenerJavaSinWeb() {
		boolean bandera = false;
		String consulta="Los desarrolladores son";
		for(String desarrollador: listaDesarrolladoresJava){
			if(!listaDesarrolladoresWeb.contains(desarrollador)){
				bandera=true;
				consulta=consulta+"\n"+desarrollador;
			}
		}
		if(bandera){
			return consulta;
		}else{
			return "No hay desarrolladores";
		}
	}
	
	/**
	 * Obtener webo celulares sin java.
	 *
	 * @return the string
	 */
	public String obtenerWeboCelularesSinJava() {
		TreeSet<String> lista = new TreeSet<String>();
		for(String desarrollador: listaDesarrolladoresWeb){
			if(!listaDesarrolladoresJava.contains(desarrollador))
				lista.add(desarrollador);
		}
		for(String desarrollador: listaDesarrolladoresCelular){
			if(!listaDesarrolladoresJava.contains(desarrollador)){
				if(!lista.contains(desarrollador))
					lista.add(desarrollador);
			}
		}
		if(lista.isEmpty()){
			return "No hay desarrolladores";
		}else{
			String consulta="Los desarrolladores son";
			for(String desarrollador: lista){
				consulta=consulta+"\n"+desarrollador;
			}
			return consulta;
		}
	}
	
	/**
	 * Obtener weby celulares sin java.
	 *
	 * @return the string
	 */
	public String obtenerWebyCelularesSinJava() {
		TreeSet<String> lista = new TreeSet<String>();
		for(String desarrollador: listaDesarrolladoresWeb){
			if(!listaDesarrolladoresJava.contains(desarrollador)){
				if(listaDesarrolladoresCelular.contains(desarrollador))
					lista.add(desarrollador);
			}
		}
		for(String desarrollador: listaDesarrolladoresCelular){
			if(!listaDesarrolladoresJava.contains(desarrollador)){
				if(listaDesarrolladoresWeb.contains(desarrollador)){
					if(!lista.contains(desarrollador))
						lista.add(desarrollador);
				}
			}
		}
		if(lista.isEmpty()){
			return "No hay desarrolladores";
		}else{
			String consulta="Los desarrolladores son";
			for(String desarrollador: lista){
				consulta=consulta+"\n"+desarrollador;
			}
			return consulta;
		}
	}
	
	
}