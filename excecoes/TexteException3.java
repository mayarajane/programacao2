 package excecoes;

 import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;  
public class TexteException3 {
	private static InputStreamReader conn;
	
	public static void main(String[] args) throws IOException {
		try {
			//codigo com várias classes chacked
		}finally {
			conn.close();
		}
	}
}
