/*
Autor: Elian Melo Morais

Data de Criação: 10/10/2018

Objetivo: Fazer um projeto usando as classes AreaCasa, AreaPiscina e Residencia

Baseado no curso Programação de Computadores da  Univesp - Universidade Virtual do Estado de São Paulo.
Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman.
https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi
*/
 class Projeto {
     Residencia[] condominio;
     int ultimo = -1; // Último alocado

     // Método que adiciona residencias ao condominio
     boolean adicionaRes(Residencia r){
         if(this.ultimo < this.condominio.length-1){
             ultimo++;
             this.condominio[ultimo] = r;
             return true;
         }
         return false;
     }

     // Construtor de um projeto
     Projeto(int tam){
         condominio = new Residencia[tam];
     }

     // Calcula a area do conjunto casa + piscina (residência)
     static double area(AreaCasa casa, AreaPiscina piscina){
         return(casa.area() + piscina.area());
     }

     // Faz uma busca sequencial
     static int buscaSeq(int[] arr, int el){
         for(int i = 0; i < arr.length; i++){
             if(arr[i] == el) return(i);
             if(arr[i] > el) break;
         }
         return(-1);
     }

     // Faz uma busca sequencial pelo raio das piscinas
     int buscaPiscSeq(double raio){
         for(int i = 0; i < this.condominio.length; i++)
             if(this.condominio[i].piscina.raio == raio) return(i);
         return(-1);
     }

     // Faz uma busca binária
     static int buscaBin(int[] arr, int el){
         int fim = arr.length-1;
         int ini = 0;
         while(ini <= fim){
             int meio = (fim + ini) / 2;
             if(arr[meio] < el) ini = meio + 1;
             else
                if(arr[meio] > el) fim = meio - 1;
                else return(meio);
         }
         return(-1);
     }

     // Faz uma busca binária nas áreas das casas do condominio
     static int buscaBin(Residencia[] arr, double area){
         int fim = arr.length-1;
         int ini = 0;
         while(ini <= fim){
             int meio = (fim + ini) / 2;
             if(arr[meio].casa.area() < area) ini = meio + 1;
             else
                if(arr[meio].casa.area() > area) fim = meio - 1;
                else return(meio);
         }
         return(-1);
     }

     public static void main(String[] args) {
         // Aqui vão os testes
     }

 }
