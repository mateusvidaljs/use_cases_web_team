public class ResultadoTernario {
  public static void main(String[] args) {
    int nota = 3;

    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Reprovado" : "Reprovado";
    System.out.println(resultado);
  }
}