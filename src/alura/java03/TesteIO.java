package alura.java03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteIO {

	public static void main(String[] args) throws IOException {

//		InputStream is = new FileInputStream("input");
		InputStream is = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
//		Scanner sc = new Scanner(is);
		
		
		OutputStream os = new FileOutputStream("./resources/filesIO/output");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String line;
		while (!(line = br.readLine()).equals(":q")) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			
		}
		
		br.close();
		bw.close();
	}
}