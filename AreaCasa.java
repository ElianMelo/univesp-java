class AreaCasa {
  static double valorM2 = 1500;

  static void areaCasa(float lateral, float cquarto){
    if(lateral >= 0 && cquarto >= 0){
      float areaq; // área do quarto
      float areas; // área da sala
      float areat; // área total

      System.out.println("Programa para cálculo da área da casa");
      areas = lateral*lateral;
      System.out.println("A área da sala é " +areas);
      areaq = cquarto * (lateral/2);
      System.out.println("A área do quarto é " +areaq);
      System.out.println("A área do banheiro é " +areaq);
      areat = areas + 2*areaq;
      System.out.println("A área total é " +areat);
    }
    else
      System.out.println("Erro: parâmetro<0");
  }

  static double valor(double area){
    return(area >= 0 ? valorM2*area : -1);
  }

  static double areaPiscina(double raio){
    return(raio >= 0 ? (Math.PI * Math.pow(raio, 2)) : -1);
  }

  public static void main(String[] args){
    double preco;
    boolean valorOK = false;
    preco = valor(20);
    valorOK = preco >= 0;
    areaCasa(7, 10);
    System.out.println(areaPiscina(5));
    if (valorOK) System.out.println("O valor da construção é " + preco);
    else System.out.println("Valor de área negativo");
  }
}
