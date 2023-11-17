package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		List<String> listaRegali = new ArrayList<>();
		
		while (true) {
			
			System.out.print("Inserisci il nome del regalo: ");
			String nomeRegalo = in.nextLine();
			
			listaRegali.add(nomeRegalo);
			
			System.out.println("\nLunghezza della lista: " + listaRegali.size() + "\n");
			
			System.out.print("Vuoi inserire un altro regalo? (si | no): ");
			String input = in.nextLine().toLowerCase();
			
			if (input.equals("no")) {
				break;
			}
		}
		
		Collections.sort(listaRegali);
		
		System.out.println("\n" + listaRegali);
		
		for (String regalo : listaRegali) {
			System.out.println(regalo);
		}
		
		in.close();
	}
}
