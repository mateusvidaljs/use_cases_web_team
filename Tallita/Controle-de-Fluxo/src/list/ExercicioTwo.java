package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Desvendando um crime
Utilizando listas, faça as perguntas abaixo para o investigado:

1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
Entre 3 e 4 como "Cúmplice" e 5 como "Assassina". 

Caso contrário, ele será classificado como "Inocente".
*/

public class ExercicioTwo {
  public static void main(String[] args) {
    List<String> respostas = new ArrayList<>();
    try (Scanner scanner = new Scanner(System.in)) {

      System.out.println("Perguntas, por favor responda sim ou nao: ");
      System.out.print("\nNo dia do crime voce telefonou para vitima? ");
      String resposta = scanner.next();
      respostas.add(resposta.toLowerCase());

      System.out.print("\nEsteve no local do crime? ");
      resposta = scanner.next();
      respostas.add(resposta.toLowerCase());

      System.out.print("\nMora perto da vitima? ");
      resposta = scanner.next();
      respostas.add(resposta.toLowerCase());

      System.out.print("\nTeve alguma desavenca recente com a vitima? ");
      resposta = scanner.next();
      respostas.add(resposta.toLowerCase());

      System.out.print("\nJa trabalhou com a vitima? ");
      resposta = scanner.next();
      respostas.add(resposta.toLowerCase());
    }

    System.out.println("\nRespostas " + respostas);

    int count = 0;
    Iterator<String> contador = respostas.iterator();
    while (contador.hasNext()) {
      String resp = contador.next();
      if (resp.contains("s")) {
        count++;
      }
    }

    switch (count) {
      case 2:
        System.out.println(">> SUSPEITA <<");
        break;
      case 3:
      case 4:
        System.out.println(">> CUMPLICE <<");
        break;
      case 5:
        System.out.println(">> ASSASSINO <<");
        break;
      default:
        System.out.println(">> INOCENTE <<");
        break;
    }
  }
}
