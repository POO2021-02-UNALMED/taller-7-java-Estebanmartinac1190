package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	//CONSTRUCTOR
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }
	
	//SET AND GET 
    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    //METODOS 
    
    public int palabrasTotales(int loca) {
    	return this.getPaginas()*loca;
    }
    
    public String toString() {
    	return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.ensenanza;
    }
}