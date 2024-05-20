package Questao04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    Set<String> ConjuntoDePalavras;

    public ConjuntoDePalavras(String palavrasSeparadas){
        String[] palavras = palavrasSeparadas.split(",");
        ConjuntoDePalavras = new HashSet<>(Arrays.asList(palavras));
    }

    public boolean contemTodas(String palavras){
        String[] palavrasSeparadas = palavras.split(",");
        for (String p : palavrasSeparadas) {
            if(!ConjuntoDePalavras.contains(p.trim())){
                return false;
            }
        }
        return true;
    }
}
