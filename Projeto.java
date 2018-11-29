 class Projeto {
     Residencia[] condominio;
     int ultimo = -1; // Último alocado

     boolean adicionaRes(Residencia r){
         if(this.ultimo < this.condominio.length-1){
             ultimo++;
             this.condominio[ultimo] = r;
             return true;
         }
         return false;
     }

     Projeto(int tam){
         condominio = new Residencia[tam];
     }

     static double area(AreaCasa casa, AreaPiscina piscina){
         return(casa.area() + piscina.area());
     }

     public static void main(String[] args) {
         // Aqui vão os testes
         Projeto proj = new Projeto(3);

         AreaCasa c = new AreaCasa(10, 5);
         AreaPiscina p = new AreaPiscina(5);
         Residencia r = new Residencia(c, p);
         proj.adicionaRes(r);

         c = new AreaCasa(12, 7);
         p = new AreaPiscina(6);
         r = new Residencia(c, p);
         proj.adicionaRes(r);

         c = new AreaCasa(10, 6);
         p = new AreaPiscina(3.5);
         r = new Residencia(c, p);
         proj.adicionaRes(r);

         System.out.println(proj.condominio[1].casa.area());
     }

 }
