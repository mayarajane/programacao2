package bibliotecas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {

	public static void main(String[] args) {
		// System.out.println("Digite uma unica mensagem: ");
		// InputStream is = System.in;
		// InputStream:classe que sabe capturar
		// nesse caso, recebendo da entrada pelo padrao do System
		try {
			// InputStream is = new FileInputStream("teste2.txt");
			OutputStream os = new FileOutputStream("teste3.txt");
			// InputStreamReader isr = new InputStreamReader(is);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			// ISR sabe receber um byte e transforma-lo em char
			// BufferedReader br = new BufferedReader(isr);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("A turma de ADS ama Java");
			bw.close();
			osw.close();
			os.close();
			System.out.println("Escrita realizada com sucesso");
			// BR sabe receber varios char e armazena-los num
			// buffer, transformando-os em String
			// char c;
			// String s;
			// try {
			// c=(char) isr.read();
			// s = br.readLine();
			// System.out.println("Você digitou a tecla: "+c);
			// System.out.println(s);
			// while(s != null) {
			// System.out.println(s);
			// s = br.readLine();
			// }
			// br.close();
			// isr.close();
			// is.close();
			// } catch (IOException e) {
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
