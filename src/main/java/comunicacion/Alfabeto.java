package comunicacion;
public class Alfabeto extends  Pictograma{
    private String[] letras;
    private String interpretacion;
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String toString(){
        String lima = "";

        for(String lupus : letras){
            lima += lupus+", ";
        }
        return lima.strip().substring(0, lima.length()-2);
    }

    public int cantidadLetras() {
        return letras.length;
    }
}
