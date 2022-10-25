package set;

import java.util.*;

public class ExercicioOne {
  public static void main(String[] args) {

    // Crie uma conjunto contendo as cores do arco-íris:
    System.out.println("\nUm arco-iris esta se formando: ");
    Set<String> coresArcoIris = new HashSet<>();
    coresArcoIris.add("Violeta");
    coresArcoIris.add("Anil");
    coresArcoIris.add("Azul");
    coresArcoIris.add("Verde");
    coresArcoIris.add("Amarelo");
    coresArcoIris.add("Laranja");
    coresArcoIris.add("Vermelho");
    // System.out.println(coresArcoIris);

    // Exiba todas as cores o arco-íris uma abaixo da outra:
    for (String cor : coresArcoIris) {
      System.out.println(cor);
    }

    // Exiba a quantidade de cores do arco-íris:
    System.out.println("\nA quantidade de cores que o arco-iris eh: " + coresArcoIris.size());

    // Exiba as cores em ordem alfabética:
    System.out.println("\nExibindo as cores em ordem alfabetica");
    Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
    System.out.println(coresArcoIris2);

    // Exiba as cores na ordem inversa da que foi informada
    System.out.println("\nExibindo a ordem inversa da ordem informada:");
    Set<String> coresArcoIris3 = new LinkedHashSet<>(
        Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
    System.out.println(coresArcoIris3);
    List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
    Collections.reverse(coresArcoIrisList);
    System.out.println(coresArcoIrisList);

    // Exiba todas as cores que começam com a letra ”v”
    System.out.println("\nApresentando apenas cores que iniciadas em ”v”: ");
    for (String cor : coresArcoIris) {
      if (cor.startsWith("v"))
        System.out.println(cor);
    }

    // Remova todas as cores que não começam com a letra “v”
    System.out.println("\nRemovendo as cores que não começam em “v”: ");
    Iterator<String> iterator2 = coresArcoIris.iterator();
    while (iterator2.hasNext()) {
      if (!iterator2.next().startsWith("v"))
        iterator2.remove();
    }
    System.out.println(coresArcoIris);

    // Limpe o conjunto
    System.out.println("O arco-iris esta indo embora: ");
    coresArcoIris.clear();

    System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
  }
}
