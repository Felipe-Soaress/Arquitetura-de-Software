import java.util.ArrayList;
import java.io.IOException;
public class primeiro {
    public static void main(String[] args) throws IOException {
        String a = "";
        int b;
        ArrayList<String> nomes = new ArrayList<> ();
        do{
        System.out.print("1 - Inserir Nome\n2 - Listar Nomes\n0 - Sair");
        b = meuScanner.lerInt(a);
           
        if(1 == b){
           System.out.print("Insira um Nome:"); 
           nomes.add(meuScanner.lerString(a)); 
        }
        if(b ==2){
            System.out.println("Nomes:");
            for(int i = 0; i < nomes.size(); i++){;
                System.out.println(nomes.get(i));
            }
            System.out.println("-----------------------------------------\nAperte enter para voltar ao Menu");
            System.in.read();
            
        }
        
        }while(b != 0);
    
        }
}