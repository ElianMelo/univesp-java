/*
Autor: Elian Melo Morais

Data de Criação: 10/10/2018

Objetivo: Integrar a AreaCasa e AreaPiscina em uma residência

Baseado no curso Programação de Computadores da  Univesp - Universidade Virtual do Estado de São Paulo.
Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman.
https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi
*/
class Residencia {
    AreaCasa casa;
    AreaPiscina piscina;

    // Construtor de uma residência
    Residencia(AreaCasa casa, AreaPiscina piscina){
        this.casa = casa;
        this.piscina = piscina;
    }

    public static void main(String[] args){
        //Aqui vão os testes
    }
}
