

package boletin15;

/**
 * Subclase entrenador de una seleccion de futbol
 * @author yperezmartinez
 * @version 1.0
 */


public class Entrenador extends Seleccion {
    private String idFederacion;

    /**
     * Constructor vacio
     */
    public Entrenador() {
    }

    /**
     * Constructor con parametros
     * @param idFederacion
     */
    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    /**
     * Constructor con parametros de la superclase
     * @param id
     * @param nome
     * @param apelido
     * @param edade
     */
    public Entrenador(int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
    }
    /**
     * @return the idFederacion
     */
    public String getIdFederacion() {
        return idFederacion;
    }
    /**
     * Set de idFederacion
     * @param idFederacion idFederacion en que hacer set 
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    /**
     * Metodo vacio dirixirPartido
     */
    public void dirixirPartido(){
        
    }
    /**
     * Metodo vacio dirixirAdestramento
     */
    public void dirixirAdestramento(){
        
    }
    /**
     * Metodo viaxar muestra mensaje de quien viaja
     */
    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }
    

    
    
    
    
}
