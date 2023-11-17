package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.lessons.java.christmas.pojo.Regalo;

public class Main {

	public static void main(String[] args) {
		
// ESERCIZIO BASE
//
//		Scanner in = new Scanner(System.in);
//		
//		List<String> listaRegali = new ArrayList<>();
//		
//		while (true) {
//			
//			System.out.print("Inserisci il nome del regalo: ");
//			String nomeRegalo = in.nextLine();
//			
//			listaRegali.add(nomeRegalo);
//			
//			System.out.println("\nLunghezza della lista: " + listaRegali.size() + "\n");
//			
//			System.out.print("Vuoi inserire un altro regalo? (si | no): ");
//			String input = in.nextLine().toLowerCase();
//			
//			if (input.equals("no")) {
//				break;
//			}
//		}
//		
//		Collections.sort(listaRegali);
//		
//		System.out.println("\n" + listaRegali);
//		
//		for (String regalo : listaRegali) {
//			System.out.println(regalo);
//		}
//		
//		in.close();


// BONUS
		
		Scanner in = new Scanner(System.in);
		
		List<Regalo> listaRegali = new ArrayList<>();
		
		while (true) {
			
			System.out.print("Inserisci il nome del regalo: ");
			String nomeRegalo = in.nextLine();
			
			System.out.print("Inserisci il destinatario del regalo: ");
			String destinatarioRegalo = in.nextLine();
			
			Regalo r = new Regalo(nomeRegalo, destinatarioRegalo);
			listaRegali.add(r);
			
			System.out.println("\nLunghezza della lista: " + listaRegali.size() + "\n");
			
			System.out.print("Vuoi inserire un altro regalo? (si | no): ");
			String input = in.nextLine().toLowerCase();
			
			if (input.equals("no")) {
				break;
			}
		}
		
		System.out.print("\nCome vuoi ordinare la lista? (nome | destinatario): ");
		String strOrdinamento = in.nextLine();
		
		
		if (strOrdinamento.equals("nome")) {

			Collections.sort(listaRegali, Comparator.comparing(regalo -> regalo.getNome()));
			
		} else {
			
			Collections.sort(listaRegali, Comparator.comparing(regalo -> regalo.getDestinatario()));
		}
		
		
		for (Regalo regalo : listaRegali) {
			System.out.println(regalo);
		}
		
		in.close();
	}
}
