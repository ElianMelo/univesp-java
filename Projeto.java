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

     static int buscaSeq(int[] arr, int el){
         for(int i = 0; i < arr.length; i++){
             if(arr[i] == el) return(i);
             if(arr[i] > el) break;
         }
         return(-1);
     }

     int buscaPiscSeq(double raio){
         for(int i = 0; i < this.condominio.length; i++)
             if(this.condominio[i].piscina.raio == raio) return(i);
         return(-1);
     }

     public static void main(String[] args) {
         // Aqui vão os testes
         int[] v = {-78, -4, 0, 32, 52, 55, 63, 69, 125, 200};

         System.out.println(buscaSeq(v, 63));
         System.out.println(buscaSeq(v, 68));

         Projeto pr = new Projeto(5);

         for(int i = 0; i < pr.condominio.length; i++){
             AreaCasa c = new AreaCasa();
             AreaPiscina p = new AreaPiscina(i+2);
             Residencia r = new Residencia(c, p);
             pr.adicionaRes(r);
         }

         System.out.println(pr.buscaPiscSeq(3));
         System.out.println(pr.buscaPiscSeq(15));
     }

 }
