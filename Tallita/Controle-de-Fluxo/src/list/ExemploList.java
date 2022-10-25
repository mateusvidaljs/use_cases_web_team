package list;

import java.util.*;

public class ExemploList {

  public static void main(String[] args) throws Exception {
    System.out.println("\nCrie uma lista e adicione sete notas: ");

    List<Double> notas = new ArrayList<>();

    notas.add(7.0);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5.0);
    notas.add(7.0);
    notas.add(0.0);
    notas.add(3.6);
    System.out.println(notas.toString());

    // Ebiba a posição da nota 5.0
    System.out.println("\nA posicao da nota 5.0 eh " + notas.indexOf(5d));

    // Adicione na lista a nota 8.0 na posição 4
    notas.add(4, 8d);
    System.out.println("\nAdicionando a nota 8.0 na posicao 4 " + notas);

    // Substitua a nota 5.0 pela nota 6.0
    notas.set(notas.indexOf(5d), 6.0);
    System.out.println("\nSubstituindo nota 5.0 pela 6.0 " + notas);

    // Confira se a nota 5.o esta na lista
    System.out.println("\nExiste a nota 5.0 esta na lista? " + notas.contains(5d));

    System.out.println("\nExiba todas as notas na ordem em que foram informados:");
    for (Double nota : notas)
      System.out.println(nota);

    System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
    System.out.println(notas.toString());

    // Exiba a menor nota
    System.out.println("\nA menor nota da lista eh : " + Collections.min(notas) + "");

    // Exiba a maior nota
    System.out.println("\nA maior nota da lista eh: " + Collections.max(notas));

    // Exiba a soma dos valores:
    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }
    System.out.println("\nA soma das notas eh " + soma);

    // Exiba a media das notas
    System.out.println("\nA media das notas eh  " + (soma / notas.size()));

    // Remova a nota 0
    notas.remove(0d);
    System.out.println("\nRemovendo a nota 0  " + notas);

    // Remova a nota da posicao 0
    notas.remove(0);
    System.out.println("\nRemovendo a nota da posicao 0 " + notas);

    // Remova as notas menores que 7
    Iterator<Double> iterator1 = notas.iterator();
    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7)
        iterator1.remove();
    }
    System.out.println("\nRemovendo as notas menores que 7 " + notas);

    // Apague toda a lista
    notas.clear();
    System.out.println("\nApagando toda a lista " + notas);

    // Confira se a lista esta vazia
    System.out.println("\nA lista esta vazia? " + notas.isEmpty());

  }
}
