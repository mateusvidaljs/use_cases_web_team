package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioOne {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      List<Double> temperaturas = new ArrayList<Double>();

      // Adicione 6 temperaturas climaticas na lista:
      int count = 0;
      while (true) {
        if (count == 6)
          break;

        System.out.print("Digite a temperatura: ");
        double temp = scan.nextDouble();
        temperaturas.add(temp);
        count++;
      }
      System.out.println("\n---------------------------\n");

      // Exibinda todas as temperaturas:
      System.out.print("TAs temperaturas informadas foram: ");
      temperaturas.forEach(t -> System.out.print(t + " "));

      // calcule e exiba a média das temperaturas:
      double media = temperaturas.stream()
          .mapToDouble(Double::doubleValue)
          .average()
          .orElse(0d);
      System.out.printf("\n\nA media das temperaturas eh: %.1f\n", media);

      // Exibinda as temperaturas acima da média
      System.out.print("\nAs temperaturas acima da media foram: ");
      temperaturas.stream()
          .filter(t -> t > media)
          .forEach(t -> System.out.printf("%.1f ", t));

      // exibindo o mês das temperaturas acima da média por extenso:
      System.out.println("\n\nMeses que tiveram as temperaturas acima da media: ");
      Iterator<Double> iterator = temperaturas.iterator();

      count = 0;
      while (iterator.hasNext()) {
        Double temp = iterator.next();
        if (temp > media) {
          switch (count) {
            case (0):
              System.out.printf("1 - Janeiro: %.1f\n", temp);
              break;
            case (1):
              System.out.printf("2 - Fevereiro: %.1f\n", temp);
              break;
            case (2):
              System.out.printf("3 - Marco: %.1f\n", temp);
              break;
            case (3):
              System.out.printf("4 - Abril: %.1f\n", temp);
              break;
            case (4):
              System.out.printf("5 - Maio: %.1f\n", temp);
              break;
            case (5):
              System.out.printf("6 - Junho: %.1f\n", temp);
              break;
            default:
              System.out.println("Nao houve temperatura acima da media.");
          }
        }
        count++;
      }
    }
  }
}
