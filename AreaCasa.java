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
    // Materias da piscina
    static final int alvenaria = 0;
    static final int vinil = 1;
    static final int fibra = 2;
    static final int plastico = 3;

    // Nomes dos materiais modo 1
    static char[][] nomes = {
        {'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a'},
        {'V', 'i', 'n', 'i', 'l'},
        {'F', 'i', 'b', 'r', 'a'},
        {'P', 'l', 'a', 's', 't', 'i', 'c', 'o'}
    };

    // Nomes dos materiais modo 2
    // static char[][] nomes = new char[4][9];
    // nomes[0][0] = 'A';
    // nomes[0][1] = 'l';
    // nomes[0][2] = 'v';

    // Nomes dos materiais modo 3
    // static char[][] = new char [4][];
    // char[] aux1 = {'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a'};
    // nomes[0] = aux1;

    // Preço dos materiais
    static double[] precos = {1500, 1100, 750, 500};

    // Valor do metro quadrado
    static double valorM2 = 1500;

    // Area da casa
    static void areaCasa(float lateral, float compQuarto){

    // Verifica se os valores são positivos
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

    // Valor do metro quadrado de acordo com a área
    static double valor(double area){
        return(area >= 0 ? valorM2 * area : -1);
    }

    // Valor metro quadrado para piscina
    static double valorPiscina(double area, int material){
        if(material < alvenaria || material > plastico || area < 0)
            return(-1);

        return(area * precos[material]);
    }

    // Area da piscina
    static double areaPiscina(double raio){
        return(raio >= 0 ? (Math.PI * Math.pow(raio, 2)) : -1);
    }

    // Calculo da media
    static double media(double[] arranjo){
        double resp = 0;

        for (double valor : arranjo) {
            resp += valor;
        }

        return(resp/arranjo.length);
    }

    // Verifica se o caractere é minusculo
    static boolean minuscula(char c){
        return(c >= 'a' && c <= 'z');
    }

    // Carrega os valores das piscinas na matriz de área x material
    static void carregaVal(double[][] m){
        for (int i = 0; i < m.length; i++) { //Linhas material
            for (int j = 50; j <= 200; j += 50) { //Colunas áreas
                m[i][j / 50 - 1] = valorPiscina(j, i);
            }
        }
    }

    public static void main(String[] args){
        // Aqui vão os testes
        double[][] valores = new double[4][4]; // Cria uma tabela de valores

        carregaVal(valores); // Carrega ela

        System.out.println("Piscina de plástico de 150m2: " + valores[plastico][2]); // Mostra um valor desta tabela

        // Faz o cálculo da media dos valores referentes a plástico
        double media = 0;

        for (double valor : valores[plastico]) {
            media += valor;
        }

        media /= valores[plastico].length;
        System.out.println("Média: " + media);

        System.out.println();

        // Percorre a matriz através dos índices
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Percorre a matriz através de seus valores
        for (double[] linha : valores) {
            for (double valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Mostra o tamanho dos nomes pelos índices
        for (int i = alvenaria; i <= plastico; i++) {
            System.out.print(nomes[i].length + " ");
        }
        System.out.println();

        // Mostra o tamanho dos nomes pelos valores
        for (char[] nome : nomes) {
            System.out.print(nome[2]);
            System.out.print(nome.length + " ");
        }
        System.out.println();

    }
}
