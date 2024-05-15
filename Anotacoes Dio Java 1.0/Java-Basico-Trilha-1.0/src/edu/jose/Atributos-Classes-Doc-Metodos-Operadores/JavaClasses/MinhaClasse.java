package edu.jose.JavaClasses;

// Classe deve conter mesmo nome do arquivo
public class MinhaClasse {
    public static void main (String[] args){

        // ----------------------------Variaveis e metodos ----------------------------//
        
        //variavel semprecomeça com letra minuscula, se for composta a partir da segundo deve ter CamelCase
        
        //quando uma variavel não muda de valor e nunca sera alterada ela sera denominada como final
        // e com letra toda maiscula e serão separadas por _ se for composta(final String br = "2021")
        
        String nome = "meunome";
        String sobrenome = "meuSobrenome";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
       
    }
    public static String nomeCompleto(String nome, String sobrenome){
        // concatenando nome, formando nome Completo
        return "resultado do primeiro metodo: " + nome.concat(" ").concat(sobrenome);
    }

    /* ---------------------------------------------   JAVA BEANS    -------------------------------------------
     * Variaveis sempre no singular tirando arrays ou coleções
     * Mesma linguagem na variavel
     * Não abrevie uma variavel
     * Não ficar variando o idioma
     * 
     *                      Metodos
     * 
     * sempre no Infinitivo = verbo e ação
     * apenas um verbo e uma ação (tipo calcularImprimir .... ele calcula ou imprime ? )
     *  
    */
}
