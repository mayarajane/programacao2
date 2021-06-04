package bibliotecas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {


	public static void main(String[] args) {
		//System.out.println("Digite uma unica mensagem: ");
				//InputStream is = System.in;
				//InputStream:classe que sabe capturar 
				//nesse caso, recebendo da entrada pelo padrao do System
				try {
					InputStream is = new FileInputStream("teste2.txt");
					InputStreamReader isr = new InputStreamReader(is);
					//ISR sabe receber um byte e transforma-lo em char
					BufferedReader br = new BufferedReader(isr);
					//BR sabe receber varios char e armazena-los num
					//buffer, transformando-os em String
					//char c;
					String s;
					//try {
					//c=(char) isr.read();
					s = br.readLine();
					//System.out.println("Você digitou a tecla: "+c);
					System.out.println(s);
					while(s != null) {
						System.out.println(s);
						s = br.readLine();
					}
					br.close();
					isr.close();
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

	}
}
