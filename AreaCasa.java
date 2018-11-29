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
    double valorM2 = 1500;

    // Comprimento da lateral da area
    double lateral = 10;

    // Comprimento da lateral maior do quarto
    double cquarto = 10;

    AreaCasa(){}

    AreaCasa(double valorM2){
        this.valorM2 = valorM2;
    }

    AreaCasa(double lateral, double cquarto){
        this.lateral = lateral;
        this.cquarto = cquarto;
    }

    AreaCasa(double lateral, double cquarto, double valorM2){
        this(lateral, cquarto);
        this.valorM2 = valorM2;
    }

    // Calcula a área da casa
    double area(){
        double areat = -1; // Area Total

        if (this.lateral >= 0 && this.cquarto >= 0) {
            areat = this.lateral * this.lateral;
            areat += this.cquarto * this.lateral;
        }

        return (areat);
    }

    // Calcula o valor total da casa
    double valor(double area){
        return (area >= 0 ? this.valorM2 * area : -1);
    }

    public static void main(String[] args){
        // Aqui vão os testes

    }
}
