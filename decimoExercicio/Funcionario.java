import java.util.*;
import com.microsoft.azure.functions.annotation.*;

import lombok.Data;

import com.microsoft.azure.functions.*;

public class Funcionario {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    @FunctionName ("OlaRest")
    public String hello(
        @HttpTrigger (
            name = "olarest",
            methods = {HttpMethod.GET},
            route = "ola"
        )
        String x) {

		return "Olá REST!";
	}

    @FunctionName ("CriarFuncionario")
    public Funcionario create (
        @HttpTrigger (
            name = "criarfuncionariorest",
            methods = {HttpMethod.POST},
            route = "funcionario"
        ) 
        Funcionario funcionario) {
            funcionario.setId(1);
            funcionario.setNome("Felipe Soares");
            funcionario.setIdade(23);
            funcionario.setSalario(900);
    
            funcionarios.add(funcionario);
    
            return funcionario;
	}

    @FunctionName ("AlterarFuncionario")
	public Funcionario update (
        @HttpTrigger (
            name = "alterarfuncionariorest",
            methods = {HttpMethod.PUT},
            route = "funcionario"
        ) 
        Funcionario funcionario) {
        funcionario.setNome(funcionario.getNome() + " - atualizado!");
        funcionario.setIdade(funcionario.getIdade() + 1);
        funcionario.setSalario(funcionario.getSalario() * 1.1);

		return funcionario;
    }

    @FunctionName ("ExcluirFuncionario")
	public boolean delete (
        @HttpTrigger (
            name = "excluirfuncionariorest",
            methods = {HttpMethod.DELETE},
            route = "funcionario"
        ) 
        Funcionario funcionario) {

            funcionario.delete(funcionario.getId());
		

		return true;
    }

    @FunctionName ("CarregaFuncionarioId")
    public Funcionario CarregaFuncionarioId(
        @HttpTrigger (
            name = "carregafuncionarioidrest",
            methods = {HttpMethod.GET},
            route = "funcionario"
           
        )
        long id){

        return funcionario;
        }

        @FunctionName ("ListaFuncionarios")
    public ArrayList<Funcionario> ListaFuncionarios(
        @HttpTrigger (
            name = "listafuncionariosrest",
            methods = {HttpMethod.GET},
            route = "funcionario"
           
        )
        boolean carrega){

        return funcionarios;
        }

}

@Data
class Funcionario{
	private Long id;
	private String nome;
    private int idade;
    private Double salario;
}