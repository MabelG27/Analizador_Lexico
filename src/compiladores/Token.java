/*
 *Clase para almacenar los lexemas en una estructura de datos
 */
package compiladores;

/**
 *
 * @author Mabel
 */
public class Token {

    /**
     * ***************************************************
     */
//Indica el tipo del token
    public Tipo_Token getTipo_Token() {
        return tipo;
    }

    public void setTipo_Token(Tipo_Token tipo) {
        this.tipo = tipo;
    }

    /**
     * ***************************************************
     */

    /**
     * ***************************************************
     */
//Indica el nombre del token   
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    /**
     * ***************************************************
     */

    private Tipo_Token tipo;
    private String valor;

    /*El enumerador  se esta encargando de extraer todos los tipos 
  posibles de lexemas crados, que en este caso so n numeros y operadores binarios.
     */
    enum Tipo_Token {
        NUMERO("[0-9]+"),
        OPERADOR_BINARIO("[*|/|+|-]");

        /*El constructor aquí creado se encarga de buscar un lexema en especifico*/
        public final String patron;

        Tipo_Token(String s) {
            this.patron = s;
        }
    }

}
