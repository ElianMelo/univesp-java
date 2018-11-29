 class Projeto {

     static double area(AreaCasa casa, AreaPiscina piscina){
         return(casa.area() + piscina.area());
     }

     public static void main(String[] args) {
         // Aqui vão os testes
         AreaCasa casaPrinc1 = new AreaCasa(10, 5);
         AreaCasa casaPrinc2 = new AreaCasa(20, 5);
         AreaPiscina piscina1 = new AreaPiscina(10);

         System.out.println(area(casaPrinc1, piscina1));
     }

 }
