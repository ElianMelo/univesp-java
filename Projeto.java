 class Projeto {
     // Calcula a área de uma casa com piscina
     static double area(double lateral, double cquarto, double raio) {
         return(AreaCasa.area(lateral, cquarto) + AreaPiscina.area(raio));
     }

     public static void main(String[] args) {
         // Aqui vão os testes
         AreaCasa casa1 = new AreaCasa();
         AreaCasa casa2 = new AreaCasa(1270);

         System.out.println(casa1.valor(casa1.area(15, 10)));
         System.out.println(casa2.valor(casa2.area(18, 8)));
     }

 }
