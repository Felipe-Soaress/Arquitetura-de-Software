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
            if(clienteList.get(i).getNome().equals(nome))
                return true;
        }
        
        return false;
    }
    
    /*Função que verifica se Pais já existe no ArrayList
    - Se existir retorna verdadeiro
    - Caso contrário, retorna falso
    */
    
    public static boolean verificaPais(String nome, ArrayList<Pais> paisList){
        for(int i = 0; i < paisList.size(); i++ ){
            if(paisList.get(i).getPais().equals(nome))
                return true;
        }
        
        return false;
    }
}
