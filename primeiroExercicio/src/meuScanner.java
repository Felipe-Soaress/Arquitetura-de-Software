import java.io.*;


    public class meuScanner{
    	public static String lerString(String lb){ 
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader ler = new BufferedReader(isr);
    		String aux = "";
    		
    		try{
				System.out.println(lb);
    			aux = ler.readLine();
    		}catch(IOException erro ) {
    			
    		}
    		return aux;
    		
    	}
    	public static double lerDouble(String lb){
    		return Double.parseDouble(lerString(lb));
    	}
    	public static int lerInt(String lb){
    		return Integer.parseInt(lerString(lb));
    	}
    }