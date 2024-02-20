package com.gestorpalabras;

public class GestorPalabras {
	
	//FIXED by Leo_de_Torres
    public boolean esPalindromo(String palabra) {
        String palabraFormateada = palabra.replaceAll("\\s+", "").toLowerCase();
        palabraFormateada = palabraFormateada.replaceAll("á", "a");
        palabraFormateada = palabraFormateada.replaceAll("é", "e");
        palabraFormateada = palabraFormateada.replaceAll("í", "i");
        palabraFormateada = palabraFormateada.replaceAll("ó", "o");
        palabraFormateada = palabraFormateada.replaceAll("ú", "u");
        palabraFormateada = palabraFormateada.replaceAll("ü", "u");
        palabraFormateada = palabraFormateada.replaceAll("ẃ", "w");
        palabraFormateada = palabraFormateada.replaceAll("ŕ", "r");
        palabraFormateada = palabraFormateada.replaceAll("ý", "y");
        palabraFormateada = palabraFormateada.replaceAll("ṕ", "p");
        palabraFormateada = palabraFormateada.replaceAll("ś", "s");
        palabraFormateada = palabraFormateada.replaceAll("ǵ", "g");
        palabraFormateada = palabraFormateada.replaceAll("j́", "j");
        palabraFormateada = palabraFormateada.replaceAll("ḱ", "k");
        palabraFormateada = palabraFormateada.replaceAll("ĺ", "l");
        palabraFormateada = palabraFormateada.replaceAll("ź", "z");
        palabraFormateada = palabraFormateada.replaceAll("ć", "c");
        palabraFormateada = palabraFormateada.replaceAll("ǘ", "u");
        palabraFormateada = palabraFormateada.replaceAll("ń", "n");
        palabraFormateada = palabraFormateada.replaceAll("ḿ", "m");
        
        

        for (int i = 0; i < palabraFormateada.length() / 2; i++) {
            if (!Character.isLetter(palabraFormateada.charAt(i))) {
                return false;
            }
            if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
	//FIXED by nakayoshi_dango
    public int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
	       if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
                || caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú'
                    ) {
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
}
