class AreaPiscina {
  public static void main(String[] args){
    double raio = 2;
    double areap;
    final double pi = 3.14159;

    areap = pi * raio * raio;
    //areap = Math.PI * Math.pow(raio, 2);
    System.out.println("área: " + areap);
  }

}
