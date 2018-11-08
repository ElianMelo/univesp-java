/*
Autor: Elian Melo Morais

Data de Criação: 10/10/2018

Objetivo: O programa tem como objetivo calcular a área de uma casa, a área de sua piscina
e o valor da piscina de acordo com cada material, além do preço do metro quardrado como referência.

Baseado no curso Programação de Computadores da  Univesp - Universidade Virtual do Estado de São Paulo.
Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman.
https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi
*/
class AreaCasa {
    //Materias da piscina
    static final int alvenaria = 0;
    static final int vinil = 1;
    static final int fibra = 2;
    static final int plastico = 3;

    //Nomes dos materiais
    static char[] nAlvenaria = {'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a'};
    static char[] nVinil = {'V', 'i', 'n', 'i', 'l'};
    static char[] nFibra = {'F', 'i', 'b', 'r', 'a'};
    static char[] nPlastico = {'P', 'l', 'a', 's', 't', 'i', 'c', 'o'};

    //Preço dos materiais
    static double precos[] = {1500, 1100, 750, 500};

    //Valor do metro quadrado
    static double valorM2 = 1500;

    //Area da casa
    static void areaCasa(float lateral, float compQuarto){

    //Verifica se os valores são positivos
    if(lateral >= 0 && compQuarto >= 0){
        float areaQuarto; // Area do quarto
        float areaSala; // Area da sala
        float areaTotal; // Area total

        System.out.println("Programa para cálculo da área da casa");
        areaSala = lateral * lateral;
        System.out.println("A área da sala é " + areaSala);
        areaQuarto = compQuarto * (lateral / 2);
        System.out.println("A área do quarto é " + areaQuarto);
        System.out.println("A área do banheiro é " + areaQuarto);
        areaTotal = areaSala + 2 * areaQuarto;
        System.out.println("A área total é " + areaTotal);
    }
    else
        System.out.println("Erro: parâmetro < 0");
    }

    //Valor do metro quadrado de acordo com a área
    static double valor(double area){
        return(area >= 0 ? valorM2 * area : -1);
    }

    //Valor metro quadrado para piscina
    static double valorPiscina(double area, int material){
        if(material < alvenaria || material > plastico || area < 0)
            return(-1);

        return(area * precos[material]);
    }

    //Area da piscina
    static double areaPiscina(double raio){
        return(raio >= 0 ? (Math.PI * Math.pow(raio, 2)) : -1);
    }

    //Calculo da media
    static double media(double[] arranjo){
        double resp = 0;

        for (double valor : arranjo) {
            resp += valor;
        }

        return(resp/arranjo.length);
    }

    //Verifica se o caractere é minusculo
    static boolean minuscula(char c){
        return(c >= 'a' && c <= 'z');
    }

    public static void main(String[] args){
        //Aqui vão os testes
        //Type Casting
        char c = 'o';
        char x = '\u00F6';
        int y = 246;

        System.out.println(c);
        System.out.println(x);
        System.out.println((char)y);

        //Percorre a tabela ASCII
        for (int i = 32; i <= 126; i++) {
            System.out.println((char)i + " : " + i);
        }

        //Nome do materials
        System.out.print("Piscina de ");
        System.out.print(nFibra);
        System.out.println(": " + valorPiscina(100, fibra));

    }
}
