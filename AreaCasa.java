class AreaCasa {
  static double valorM2 = 1500;

  static void areaCasa(float lateral, float cquarto){
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

  static double valor(double area){
    if(area >= 0) return(valorM2*area);
    return(-1);
  }

  static double areaPiscina(double raio){
    return (Math.PI * Math.pow(raio, 2));
  }

  public static void main(String[] args){
    double preco;
    boolean valorOK = false;
    preco = valor(20);
    valorOK = preco >= 0;
    if (valorOK) System.out.println("O valor da construção é " + preco);
    else System.out.println("Valor de área negativo");
  }
}
