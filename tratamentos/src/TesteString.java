public class TesteString {
  private static void aumentarLetras() throws Exception {

      String frase = "Sou um teste!";
      String novaFrase = null;
      try {
          novaFrase = frase.toUpperCase();
      } catch (NullPointerException e) {
          throw new Exception(e);
      }
      System.out.println("Frase antiga: " + frase);
      System.out.println("Frase nova: " + novaFrase);
  }

  public static void main(String args[]) {
      try {
          aumentarLetras();
      } catch (Exception e) {
          System.out.println("Ocorreu uma exceção ao executar o método aumentarLetras() " + e);
      }
  }

  public class SemLetraBException extends Exception {
      @Override
      public String getMessage() {
          return "Não existe letra B em sua frase";
      }
  }

  public class TesteExcecao {
      public static void main(String args[]) throws SemLetraBException {
          String frase = "Sou um teste!";
          if (!frase.contains("b") || !frase.contains("B")) {
              throw new SemLetraBException();
          }
      }
  }
}