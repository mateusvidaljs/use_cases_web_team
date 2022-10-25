package set;

import java.util.*;

// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

// Set notas = new HashSet(); //antes do java 5
// HashSet<Double> notas = new HashSet<>();
// Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk
// 7)
/*
 * Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
 * notas.add(1d);
 * notas.remove(5d);
 * System.out.println(notas);
 */

public class ExemploSet {
  public static void main(String[] args) {

    System.out.println("\nCrie um conjunto e adicione as notas: ");
    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(notas.toString());

    // Confira se a nota 5.0 esta no conjunto
    System.out.println("\nA nota 5.0 esta no conjunto? " + notas.contains(5d));

    // Exiba a menor nota
    System.out.println("\nA menor nota eh: " + Collections.min(notas));

    // Exiba a maior nota
    System.out.println("\nA maior nota eh: " + Collections.max(notas));

    Iterator<Double> iterator = notas.iterator();
    Double soma = 0.0;
    while (iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }

    // Exiba a soma dos valores
    System.out.println("\nA soma dos valores: " + soma);

    // Exiba a media das notas
    System.out.println("\nA media das notas eh: " + (soma / notas.size()));

    // Remova a nota 0
    System.out.println("\nRemovendo a nota 0: ");
    notas.remove(0d);
    System.out.println(notas);

    // Remova as notas menores que 7
    System.out.println("\nAs notas menores que 7 foram removidas: ");
    Iterator<Double> iterator1 = notas.iterator();
    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7)
        iterator1.remove();
    }
    System.out.println(notas);

    // Exiba todas as notas na ordem em que foram informados:
    System.out.println("\nAs notas foram disponibilizadas nessa ordem: ");
    Set<Double> notas2 = new LinkedHashSet<>();
    notas2.add(7d);
    notas2.add(8.5);
    notas2.add(9.3);
    notas2.add(5d);
    notas2.add(7d);
    notas2.add(0d);
    notas2.add(3.6);
    System.out.println(notas2);

    // Exiba todas as notas na ordem crescente:
    System.out.println("\nExibindo as notas em ordem crescente: ");
    Set<Double> notas3 = new TreeSet<>(notas2);
    System.out.println(notas3);

    // Apague o conjunto notas e mantenha notas2 e notas3
    System.out.println("\nTodas as notas estao sendo apagadas: ");
    notas.clear();

    System.out.println("\nConfira se o conjunto esta vazio: " + notas.isEmpty());
    System.out.println("\nConfira se o conjunto 2 esta vazio: " + notas2.isEmpty());
    System.out.println("\nConfira se o conjunto 3 esta vazio: " + notas3.isEmpty());

  }
}
