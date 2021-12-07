package comunicacion;

public class Periodico extends Escrito {
	//ATRIBUTOS
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	//CONSTRUCTOR
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }
	
	//SET AND GET
	
	public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    //METODOS
    public String toString() {
    	return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.fecha + "\n" + this.primicia;
    }
    
    public int palabrasTotales(int tula) {
        int rin =10;
    	return this.getPaginas()*tula *rin;
    }
	
}
