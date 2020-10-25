public class Personas {


    private String Nombre;
    private int NroDocumento;

    public Personas() {
    }

    public Personas(String Nombre, int NroDocumento) {

        this.Nombre = Nombre;
        this.NroDocumento = NroDocumento;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setNroDocumento(int NroDocumento) {
        NroDocumento = NroDocumento;
    }



    public String getNombre() {
        return Nombre;
    }

    public int getNroDocumento() {
        return NroDocumento;
    }
}
