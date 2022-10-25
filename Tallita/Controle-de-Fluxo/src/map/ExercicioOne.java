package map;

import java.util.*;

/*
 Dada a populacao estimada de alguns estados do nordeste brasileiro, faca:
 Estado = PE - populacao = 9.616.621
 Estado = AL - populacao = 3.351.543
 Estado = CE - populacao  = 9.187.103
 Estado = RN - populacao = 3.534.265
*/

public class ExercicioOne {
  public static void main(String[] args) {
    // Crie um dicionario que relacione os estados e suas respectivas populacoes
    Map<String, Integer> populacaoEstadosNE = new HashMap<>() {
      {
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
      }
    };
    System.out.println(populacaoEstadosNE);

    // Substitua a populacao do estado RN por : 3.534.165
    System.out.println("\nA populacao do estado RN mudou para: 3.534.165");
    populacaoEstadosNE.put("RN", 3534165);
    System.out.println(populacaoEstadosNE);

    // Adicione PB - 4.039.277:
    populacaoEstadosNE.put("PB", 4039277);
    System.out.println("\nAdicionando o estado PB e sua respectiva populacao: \n" + populacaoEstadosNE);

    // Exiba a populacao do estado PE:
    System.out.println("\nA populacao do estado PE: " + populacaoEstadosNE.get("PE"));

    // Exiba todos os estados e suas populacaos na ordem em que foram informados:
    System.out.println("\nApresentacao todos os estados na ordem em que foram informados: ");
    Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>() {
      {
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
        put("PB", 4039277);
      }
    };
    System.out.println(populacaoEstadosNE2);

    // Exiba todos os estados e suas populacoes na ordem alfabetica:
    System.out.println("\nApresentacao dos estados e suas populacoes em ordem alfabetica: ");
    Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
    System.out.println(populacaoEstadosNE3);

    Collection<Integer> populacao = populacaoEstadosNE.values();
    String estadoMaiorPopulacao = "";
    String estadoMenorPopulacao = "";
    for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()) {
      if (entry.getValue().equals(Collections.max(populacao)))
        estadoMaiorPopulacao = entry.getKey();
      if (entry.getValue().equals(Collections.min(populacao)))
        estadoMenorPopulacao = entry.getKey();
    }

    // Exiba o estado com o menor populacao (%s) e seu respectivo valor (%d)
    System.out.printf("\nApresentando o estado com o menor populacao (%s) e seu respectivo valor (%d)\n",
        estadoMenorPopulacao, Collections.min(populacao));

    // Exiba o estado com a maior populacao (%s) e seu respectivo valor (%d)
    System.out.printf("\nApresentando o estado com a maior populacao (%s) e seu respectivo valor (%d)\n",
        estadoMaiorPopulacao, Collections.max(populacao));

    // Exiba a soma da populacao desses estados:
    int soma = 0;
    Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
    while (iterator.hasNext()) {
      soma += iterator.next();
    }
    System.out.println("\nA soma da populacao destes estados eh: " + soma);

    // Exiba a media da populacao deste dicionario de estados:
    System.out.println("\nA media da populacao destes estados eh: " + (soma / populacaoEstadosNE.size()));

    // Remova os estados com a populacao menor que 4.000.000
    Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
    while (iterator1.hasNext()) {
      if (iterator1.next() <= 4000000)
        iterator1.remove();
    }
    System.out.println("\nOs estados com a populacao menor que 4.000.000 foram removidos: \n" + populacaoEstadosNE);

    // Apague o dicionario de estados com suas respectivas populacoes estimadas:
    populacaoEstadosNE.clear();
    System.out.println("\nTodos os estados foram apagados: " + populacaoEstadosNE);

    // Confira se a lista esta vazia
    System.out.println("\nA lista de estados esta vazia? " + populacaoEstadosNE.isEmpty());

  }
}
