package comunicacion;

public class Alfabeto extends Pictograma {
	//ATRIBUTOS
	private String[] letras;
	private String interpretacion;
	
	//CONSTRUCTOR 
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	//SET AND GET 
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String[] getLetras() {
		return letras;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	//METODOS
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String toString() {
		String espacio= "";
		for (String lina: letras) {
			espacio +=lina+", ";
		}
		return espacio.strip().substring(0, espacio.length()-2);
	}

}
