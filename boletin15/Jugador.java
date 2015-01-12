

package boletin15;

/**
 * Subclase jugador de una seleccion de futbol
 * @author yperezmartinez
 * version 1.0
 */

public class Jugador extends Seleccion {
    int dorsal;
    String demarcacion;

    /**
     * Constructor vacio
     */
    public Jugador() {
    }

    /**
     *Constructor con parametros de la superclase
     * @param dorsal
     * @param demarcacion
     * @param id
     * @param nome
     * @param apelido
     * @param edade
     */
    public Jugador(int dorsal, String demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    /**
     * @return the dorsal 
     */
    public int getDorsal() {
        return dorsal;
    }
    /**
     * @return the Demarcacion
     */
    public String getDemarcacion() {
        return demarcacion;
    }
    /**
     * Set de dorsal
     * @param dorsal dorsal en el que hay que hacer set 
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    /**
     * Set de demarcacion
     * @param demarcacion demarcacion en el que hay que hacer set 
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    /**
     * Metodo vacio xogarPartido
     */
    public void xogarPartido(){
        
    }
    /**
     * Metodo vacio entrenar
     */
    public void entrenar(){
        
    }
    /**
     * Metodo viaxar muestra mensaje de quien viaja
     */
    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }

    
    
    
    
    
}
