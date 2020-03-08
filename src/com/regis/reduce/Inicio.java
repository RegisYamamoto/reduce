package com.regis.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Inicio {

	public static void main(String[] args) {
		
		
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String s = "A atitude é como a pontuação em uma frase. Pode mudar tudo.";
		String[] split = s.split(" ");
		List<String> listaStr = Arrays.asList(split);
		
		
		// ----------------------------------------------------------------------
		
		
		// reduce - soma
		System.out.println("reduce - soma");
		
		Optional<Integer> soma = lista.stream()
				.reduce((n1, n2) -> n1 + n2);
		System.out.println(soma.get());
		
		System.out.println("---");
		
		
		// ----------------------------------------------------------------------
		
		
		// reduce multiplicação
		System.out.println("reduce multiplicação");
		
		Optional<Integer> multiplicacao = lista.stream()
				.reduce((n1, n2) -> n1 * n2);
		System.out.println(multiplicacao.get());
		
		System.out.println("---");
		
		
		// ----------------------------------------------------------------------

		
		// reduce concatenação
		System.out.println("reduce - concatenação");
		
		Optional<String> concatenacao = listaStr.stream()
				.reduce((s1, s2) -> s1.concat(s2));
		System.out.println(concatenacao.get());
		
		System.out.println("---");
		
		
		// ----------------------------------------------------------------------
		
		// reduce - menor valor
		System.out.println("reduce - menor valor");
		
		OptionalDouble menorValor = DoubleStream.of(1.5, 2.9, 6.7)
		  .reduce((d1, d2) -> Math.min(d1, d2));
		System.out.println(menorValor);
		
		System.out.println("---");
		
	}

}