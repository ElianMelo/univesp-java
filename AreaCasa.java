/*
Autor: Elian Melo Morais

Data de Criação: 10/10/2018

Objetivo: O programa tem como objetivo calcular a área de uma casa, a área de sua piscina
e o valor da piscina de acordo com cada material, além do preço do metro quardrado como referência.

Baseado no curso Programação de Computadores da  Univesp - Universidade Virtual do Estado de São Paulo.
Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman.
https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi
*/
/* Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos:
   uma sala, um banheiro e um quarto */
class AreaCasa {
    // Valor do metro quadrado da casa
    static double valorM2;

    AreaCasa(){
        this(1500.0);
    }
    AreaCasa(double valorM2){
        this.valorM2 = valorM2;
    }

    // Calcula a área da casa e dos cômodos
    static void areaCasa(double lateral, double compQuarto){

    // Verifica se os valores são positivos
    if (lateral >= 0 && compQuarto >= 0){
        double areaQuarto; // Area do quarto
        double areaSala; // Area da sala
        double areaTotal; // Area total

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

    // Calcula a área da casa
    static double area(double lateral, double compQuarto){
        double areat = -1; // Area Total

        if (lateral >= 0 && compQuarto >= 0) {
            areat = lateral * lateral;
            areat += compQuarto * lateral;
        }

        return (areat);
    }

    // Calcula o valor total da casa
    static double valor(double area){
        return (area >= 0 ? valorM2 * area : -1);
    }

    public static void main(String[] args){
        // Aqui vão os testes

    }
}
