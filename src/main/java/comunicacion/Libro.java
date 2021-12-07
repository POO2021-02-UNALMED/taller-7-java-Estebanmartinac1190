package comunicacion;

public class Libro extends Escrito {
	//ATRIBUTOS
	private String co_autor;
	private String edicion;
	private String editorial;
	private String interpretacion;
	
	//CONSTRUCTOR
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor= co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	// SET AND GET 
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public void setCo_autor(String co_autor) {
		this.co_autor= co_autor;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setEdicion(String edicion) {
		this.edicion= edicion;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial= editorial;
	}
	
	public String getIntrepretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//METODOS 
	
	public String toString() {
        return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.co_autor + "\n" + this.editorial + "\n" + this.edicion;
    }
	
	public int palabrasTotales(int ruca) {
		int Fala=2;
		return this.getPaginas() * ruca * Fala; 
	}
}
