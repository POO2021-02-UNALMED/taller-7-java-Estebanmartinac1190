package comunicacion;

public class Tesis extends Escrito {
	//ATRIBUTOS
	private String idea;
	private String conclusion;
	private String[] argumentos;
	private String referencias;
	private String interpretacion;
	
	//CONSTRUCTOR
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.referencias = referencias;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.interpretacion = interpretacion;
    }
	
	//SET AND GET 
	
	public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }
    
    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusio) {
        this.conclusion = conclusio;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public void setInterprEtacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    //METODOS
    
    public String toString() {
    	return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.idea + "\n" + this.argumentos.length + "\n" + this.conclusion + "\n" + this.referencias;
    }
    
    public int palabrasTotales(int saca) {
    	int tena=5;
    	return this.getPaginas()* saca * tena;
    }
}
