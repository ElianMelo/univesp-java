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
         for(int i = 0; i < arr.length; i++)
             if(arr[i] == el) return(i);
         return(-1);
     }

     public static void main(String[] args) {
         // Aqui vão os testes
         int[] v = {9, 8, 4, 6, 3, 4};

         System.out.println(buscaSeq(v, 4));
         System.out.println(buscaSeq(v, 12));
     }

 }
