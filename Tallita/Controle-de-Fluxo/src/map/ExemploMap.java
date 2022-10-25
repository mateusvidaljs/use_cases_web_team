package map;

import java.util.*;

public class ExemploMap {
  public static void main(String[] args) {
    /*
     * Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
     * modelo = gol - consumo = 14,4km/l
     * modelo = uno - consumo = 15,6 km/l
     * modelo = mobi - consumo = 16,1 km/l
     * modelo = hb20 - consumo = 14,5 km/l
     * modelo = kwid - consumo = 15,6 km/l
     */

    // Crie um dicionario que relacione os modelos e seus respectivos consumos
    Map<String, Double> carrosPopulares = new HashMap<>() {
      {
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
      }
    };
    System.out.println("Tabela de veiculos e seus consumos: " + carrosPopulares.toString());

    // Substitua o consumo do gol por 15,2 km/l
    carrosPopulares.put("gol", 15.2);
    System.out.println("\nAlerta... consumo do Gol aumentou para 15,2 km/l: " + carrosPopulares);

    // Confira se o modelo tucson está na tabela
    System.out.println("\nTucson esta na tabela? " + carrosPopulares.containsKey("tucson"));

    // Exiba o consumo do uno
    System.out.println("\nO consumo atual do uno eh : " + carrosPopulares.get("uno"));

    // Exiba os modelos
    Set<String> modelos = carrosPopulares.keySet();
    System.out.println("\nOs modelos que temos atualmente sao: " + modelos);

    // Exiba os consumos dos carros
    Collection<Double> consumos = carrosPopulares.values();
    System.out.println("\nLista de consumo dos carros disponiveis: " + consumos);

    // Exiba o modelo mais econômico e seu consumo
    Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
    Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
    String modeloMaisEficiente = "";

    for (Map.Entry<String, Double> entry : entries) {
      if (entry.getValue().equals(consumoMaisEficiente)) {
        modeloMaisEficiente = entry.getKey();
        System.out.println(
            "\nO modelo mais eficiente disponivel no momento eh o " + modeloMaisEficiente + " com "
                + consumoMaisEficiente
                + " km/l");
      }
    }

    // Exiba o modelo menos econômico e seu consumo
    Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
    String modeloMenosEficiente = "";
    for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
      if (entry.getValue().equals(consumoMenosEficiente)) {
        modeloMenosEficiente = entry.getKey();
        System.out.println("\nO modelo menos eficiente disponivel no momento eh o  " + modeloMenosEficiente + " com "
            + consumoMenosEficiente + " km/l");
      }
    }

    // Exiba a soma dos consumos
    Iterator<Double> iterator = carrosPopulares.values().iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      soma += iterator.next();
    }
    System.out.println("\nA soma do consumo de todos os veiculos eh: " + soma);

    // Exiba a media dos consumos
    System.out.println("\nA media de consumo dos veiculos eh: " + (soma / carrosPopulares.size()));

    // Remova os modelos com o consumo igual a 15,6 km/l
    Iterator<Double> iterator1 = carrosPopulares.values().iterator();
    while (iterator1.hasNext()) {
      if (iterator1.next().equals(15.6))
        iterator1.remove();
    }
    System.out
        .println("\nOs modelos com o consumo igual a 15,6 km/l não estão disponiveis no momento: " + carrosPopulares);

    // Exiba todos os carros na ordem em que foram informados
    Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {
      {
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
      }
    };
    System.out.println("\nOs veiculos foram disponibilizados nesta ordem: " + carrosPopulares1.toString());

    // Exiba os veiculos ordenado pelo modelo
    Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
    System.out.println("\nVeiculos ordenados por modelo: " + carrosPopulares2.toString());

    // Apague todos carros
    carrosPopulares.clear();
    System.out.println("\nExibindo veiculos disponiveis: " + carrosPopulares);

    // Confira se o dicionário está vazio
    System.out.println("\nTodos os veiculos foram alugados?: " + carrosPopulares.isEmpty());
  }
}
