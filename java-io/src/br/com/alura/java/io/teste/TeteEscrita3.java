package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TeteEscrita3 {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//FileWriter fw = new FileWriter("lorem2.txt");
//BufferedWriter bw = new BufferedWriter(new FileWriter("java-io/lorem2.txt"));

		//PrintStream ps = new PrintStream(new File("java-io/lorem2.txt"));
		PrintWriter ps = new PrintWriter("java-io/lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println("Jean da Costa Abreu e Tati Bonifacio Gomes Abreu");
		
		ps.close();
	}

}
