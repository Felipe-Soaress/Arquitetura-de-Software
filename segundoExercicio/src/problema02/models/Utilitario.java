/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02.models;

/**
 *
 * @author gustavo
 */
import java.util.ArrayList;


public class Utilitario { 
    
    /*Função que verifica se Cliente já existe no ArrayList
    - Se existir retorna verdadeiro
    - Caso contrário, retorna falso
    */
    
    public static boolean verificaCliente(String nome, ArrayList<Cliente> clienteList){
        for(int i = 0; i < clienteList.size(); i++ ){
            if(clienteList.get(i).getNome().equalsIgnoreCase(nome))
                return true;
        }
        
        return false;
    }
    
    /*Função que encontra se pais existe na lista
    - Se existir retorna pais
    - Caso contrário, retorna null
    */
    
    public static Pais verificaPais(String nome, ArrayList<Pais> paisList){
        
        if(nome.length() == 2){ // As siglas de países possuem dois caracteres, por isso é analisado desta forma
           return verificaPaisPorSigla(nome, paisList);
        }
        
        for(int i = 0; i < paisList.size(); i++ ){
            if(paisList.get(i).getPais().equalsIgnoreCase(nome))
                return paisList.get(i);
        }
        
        return null;
    }
    
    /*Função que encontra o pais com a sigla informada
    - retorna o pais se existir
    - caso contrário, retorna null
    */
    public static Pais verificaPaisPorSigla(String nome, ArrayList<Pais> paisList){
        for(int i = 0; i < paisList.size(); i++ ){
            if(paisList.get(i).getSigla().equalsIgnoreCase(nome))
                return paisList.get(i);
        }
        
        return null;
    }
    
    //Função para calcular o limite
    public static float calculaLimiteCliente(int idade, String nome_pais){
        float limite = 0;
        
        if(idade<18)
            limite = 100;
        else if(idade>=18 && idade<=35)
            limite = 300;
        else
            limite = 500;
        
        //Verificando se o país adicionado é o Brasil
        if(nome_pais.equals("Brasil"))
            limite += 100;
        
        return limite;
    }
}
