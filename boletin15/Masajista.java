

package boletin15;

/**
 * Subclase masajista de una seleccion de futbol
 * @author yperezmartinez
 * version 1.0
 */

public class Masajista extends Seleccion {
    String titulacion;
    int anosExperiencia;

    /**
     * Constructor vacio
     */
    public Masajista() {
    }

    /**
     * Constructor con parametros
     * @param titulacion
     * @param anosExperiencia
     */
    public Masajista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    /**
     * Constructor con parametros de la superclase
     * @param titulacion
     * @param anosExperiencia
     * @param id
     * @param nome
     * @param apelido
     * @param edade
     */
    public Masajista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    /**
     * @return the titulacion 
     */
    public String getTitulacion() {
        return titulacion;
    }
    /**
     * @return the anosExperiencia 
     */
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    /**
     * Metodo vacio darMasaxe
     */
    public void darMasaxe(){
        
    }
    /**
     * Metodo viaxar muestra mensaje de quien viaja
     */
    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }
    
    
    
    

}
