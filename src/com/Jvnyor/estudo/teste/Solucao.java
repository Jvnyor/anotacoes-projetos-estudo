package com.Jvnyor.estudo.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solucao {

	public static void main(String[] args) {
		System.out.println(findAge("key: Matheus, value: 25; key: Henrique, value: 29; key: Glória, value: 21"));
	}
	
	public static String findAge(String input) {
		List<String> names = new ArrayList<>();
	
		String[] persons = input.split(";");
		for (String person : persons) {

			List<String> personSplit = Arrays.asList(person.split(", "));
			String name = Arrays.asList(personSplit.get(0).split(": ")).get(1).trim();
			String age = Arrays.asList(personSplit.get(1).split(": ")).get(1).trim();
			if (Integer.parseInt(age) < 29) {
				names.add(name);
			}
		}
		
//		Arrays.stream(input.split(";")).forEach(person -> {
//	
//			List<String> personSplit = Arrays.asList(person.split(", "));
//		
//			String name = Arrays.asList(personSplit.get(0).split(": ")).get(1).trim();
//			String age = Arrays.asList(personSplit.get(1).split(": ")).get(1).trim();
//		
//			System.out.println(personSplit);
//			System.out.println(name);
//			System.out.println(age);
//			System.out.println("----------------");
//			
//			if (Integer.parseInt(age) < 29){
//				names.add(name);
//			}
//		});

		return String.format("%d Pessoa(s): %s", names.size(), String.join(", ", names));
	}
}
