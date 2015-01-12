

package boletin15;

/**
 * Superclase seleccion 
 * @author yperezmartinez
 * @version 1.0
 */


public class Seleccion {
    private int id;
    private String nome;
    private String apelido;
    private int edade;

    /**
     * Constructor vacio
     */
    public Seleccion() {
    }

    /**
     * Constructor con parametros
     * @param id
     * @param nome
     * @param apelido
     * @param edade
     */
    public Seleccion(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }
    /**
     * @return the id 
     */
    public int getId() {
        return id;
    }
    /**
     * @return the nome 
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the apelido 
     */
    public String getApelido() {
        return apelido;
    }
    /**
     * @return the edade
     */
    public int getEdade() {
        return edade;
    }
    /**
     * @param id id que hay que hacer set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param nome nombre que hay que hacer set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param apelido apellido que hay que hacer set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    /**
     * @param edade edad que hay que hacer set
     */
    public void setEdade(int edade) {
        this.edade = edade;
    }
    /**
     * Metodo concentrarse que indica que se concentra la seleccion
     */
    public void concentrarse(){
        System.out.println("concentrase a selección");
    }
    /**
     * Metodo viaxar muestra mensaje de quien viaja
     */
    public void viaxar(){
        System.out.println("viaxa a selección");
    }
    
}
