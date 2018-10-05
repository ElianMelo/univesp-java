class AreaCasa {
  //Variáveis globais
  static final int alvenaria = 0;
  static final int vinil = 1;
  static final int fibra = 2;
  static final int plastico = 3;
  static double valorM2 = 1500;

  //Area da casa
  static void areaCasa(float lateral, float cQuarto){
    if(lateral >= 0 && cQuarto >= 0){
      float areaQ; // área do quarto
      float areaS; // área da sala
      float areaT; // área total

      System.out.println("Programa para cálculo da área da casa");
      areaS = lateral*lateral;
      System.out.println("A área da sala é " +areaS);
      areaQ = cQuarto * (lateral/2);
      System.out.println("A área do quarto é " +areaQ);
      System.out.println("A área do banheiro é " +areaQ);
      areaT = areaS + 2*areaQ;
      System.out.println("A área total é " +areaT);
    }
    else
      System.out.println("Erro: parâmetro<0");
  }

  //Valor metro quadrado
  static double valor(double area){
    return(area >= 0 ? valorM2*area : -1);
  }

  //Valor metro quadrado para piscina
  static double valorPiscina(double area, int material){
    double valor;
    switch(material){
      case alvenaria: return(area*1500);
      case vinil: return(area*1100);
      case fibra: return(area*750);
      case plastico: return(area*500);
      default: return(-1);
    }
  }

  //Area da piscina
  static double areaPiscina(double raio){
    return(raio >= 0 ? (Math.PI * Math.pow(raio, 2)) : -1);
  }

  public static void main(String[] args){
    //Testes goes here
    double area = 100;
    int tipo = 0;
    System.out.println("Material\tValor");
    while(tipo <= 3){
      System.out.println(tipo + "\t\t" + valorPiscina(area, tipo));
      tipo = tipo + 1;
    }

  }
}
