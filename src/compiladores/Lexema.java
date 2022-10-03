package compiladores;

import compiladores.Token.Tipo_Token;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexema {

    /*El método LEX , toma como entrada una expresión arimética y devuelve un vector
    con los tokens obtenidos */
    public static ArrayList<Token> lex(String input) {

        final ArrayList<Token> tokens = new ArrayList<Token>();

        /*Utilizé StringTokenizer para identificar cada palabra separada por espacio, 
        la clase la devuelve en un arreglo.*/
        final StringTokenizer st = new StringTokenizer(input);
        /*Aquí se va cogiendo cada palabra y se convierte en token,
        Para cada palabra encontrada se recorre los tipos de tokens que ya se definio en la clase que llamé token*/

        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();
            boolean matched = false;

            for (Tipo_Token tokenTipo : Tipo_Token.values()) {

                //Pattern y Matcher dice a que tipo de token corresponde cada palabra encontrada
                Pattern patron = Pattern.compile(tokenTipo.patron);
                Matcher matcher = patron.matcher(palabra);
                if (matcher.find()) {
                    Token tk = new Token();
                    tk.setTipo_Token(tokenTipo);
                    tk.setValor(palabra);
                    tokens.add(tk);
                    matched = true;
                }
            }
            /*matched nos especifica si el token encontrado es correcto, de lo contrario arroja un error*/
            if (!matched) {
                throw new RuntimeException("Se encontró un token invalido.");
            }
        }

        return tokens;
    }

}
