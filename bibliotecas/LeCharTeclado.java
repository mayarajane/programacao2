package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma unica tecla: ");
		InputStream is = System.in;
		// InputStream:classe que sabe capturar
		// nesse caso, recebendo da entrada pelo padrao do System
		InputStreamReader isr = new InputStreamReader(is);
		// A classe ISR sabe receber um byte e transforma-lo em char
		char c;
		try {
			c = (char) isr.read();
			System.out.println("Você digitou a tecla: " + c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
