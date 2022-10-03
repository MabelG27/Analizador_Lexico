/*
 //Mabel García Díaz
//1-19-1077
//Analizador lexico
//INF-920-001 COMPILADORES
 */
package compiladores;

import static compiladores.Lexema.lex;
import java.util.ArrayList;
import java.util.ArrayList;
/*
 * @author Mabel
 */
public class Analizador_Lexico {

    public static void main(String[] args) {
        
        ArrayList<Token> lex = new ArrayList<Token> ();
        
        String input = "25 + 12 - 16";
        
        ArrayList<Token> tokens = lex(input);
        for (Token token : tokens) {
            System.out.println("(" + token.getTipo_Token() + ": " + token.getValor() + ")");
        }
    }

}
