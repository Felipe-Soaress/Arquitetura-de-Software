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
        
        if(nome.length() == 3){
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
    
    //Faz a verificação se codigo do telefone é o mesmo do país digitado
    public static boolean verificaCodigoTelefone(Pais pais, String telefone){
    
        //Retorna verdadeiro se iguais e falso se diferentes
        return pais.getCodigoTelefone().equals(telefone.substring(0,2));
    
    }
}
