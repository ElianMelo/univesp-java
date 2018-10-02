/*
  Programa para calculara área de uma casa (e seus cômodos) de 3 cômodos:
  uma sala de 10x10m, um banheiro e um quarto  de 5x7m cada
*/
class CasaRet {
  public static void main(String[] args){
    //Primeira Etapa

    /*
    System.out.println("Programa para cálculo da área da casa");
    System.out.println("A área da sala é " + 10*10);
    System.out.println("A área do quarto é " + 5*7);
    System.out.println("A área do banheiro é " + 5*7);
    System.out.println("A área total é " + (10*10 + 5*7 + 5*7));
    */

    //Segunda Etapa
    int areaq; //área do quarto
    int areas; //área da sala
    int areat; //área total

    System.out.println("Programa para cálculo da área da casa");
    areas = 10*10;
    System.out.println("A área da sala é " + areas);
    areaq = 7*5;
    System.out.println("A área do quarto é " + areaq);
    System.out.println("A área do banheiro é " + areaq);
    areat = areas + 2*areaq;
    System.out.println("A área total é " + areat);
  }
}
