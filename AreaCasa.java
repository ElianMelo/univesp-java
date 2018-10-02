class AreaCasa {
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

  static double areaPiscina(double raio){
    return (Math.PI * Math.pow(raio, 2));
  }

  public static void main(String[] args){
    double areap; // área piscina
    double raio = 2; // raio da piscina

    areaCasa(11, 7);

    areap = areaPiscina(raio);
    System.out.println("área: " + areap);
  }
}
