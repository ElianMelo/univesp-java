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

    // Nomes dos materiais
    static char[][] nomes = {
        {'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a'},
        {'V', 'i', 'n', 'i', 'l'},
        {'F', 'i', 'b', 'r', 'a'},
        {'P', 'l', 'a', 's', 't', 'i', 'c', 'o'}
    };

    // Preço dos materiais
    static double[] precos = {1500, 1100, 750, 500};

    // Valor do metro quadrado
    static double valorM2 = 1500;

    // Area da casa
    static void areaCasa(float lateral, float compQuarto){

    // Verifica se os valores são positivos
    if (lateral >= 0 && compQuarto >= 0){
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
        return (area >= 0 ? valorM2 * area : -1);
    }

    // Valor metro quadrado para piscina
    static double valorPiscina(double area, int material){
        if(material < alvenaria || material > plastico || area < 0)
            return(-1);

        return (area * precos[material]);
    }

    // Area da piscina
    static double areaPiscina(double raio){
        return (raio >= 0 ? (Math.PI * Math.pow(raio, 2)) : -1);
    }

    // Calculo da media
    static double media(double[] arranjo){
        double resp = 0;

        for (double valor : arranjo) {
            resp += valor;
        }

        return (resp/arranjo.length);
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
    // Retorna a matriz com os preços finais.
    // Parâmetros:
    //     val - matriz de valores
    //     desc - matriz de descontos
    static double[][] calculaFinal(double[][] val, double[][] desc){
        double[][] saida = new double[val.length][val[0].length];

        for (int i = 0; i < saida.length; i++) {
            for (int j = 0; j < saida[0].length ; j++) {
                saida[i][j] = val[i][j] * (1 - desc[i][j]);
            }
        }

        return (saida);
    }

    static double[][] somaMatrizes(double[][] a, double[][] b){
        if (a.length != b.length || a[0].length != b[0].length){
            return null;
        } else {
            double[][] resp = new double[a.length][a[0].length];
            for (int i = 0; i < resp.length; i++) {
                for (int j = 0; j < resp[0].length; j++) {
                    resp[i][j] = a[i][j] + b[i][j];
                }
            }
            return resp;
        }
    }

    static double[][] subtraiMatrizes(double[][] a, double[][] b){
        if (a.length != b.length || a[0].length != b[0].length){
            return null;
        } else {
            double[][] resp = new double[a.length][a[0].length];
            for (int i = 0; i < resp.length; i++) {
                for (int j = 0; j < resp[0].length; j++) {
                    resp[i][j] = a[i][j] - b[i][j];
                }
            }
            return resp;
        }
    }

    public static void main(String[] args){
        // Aqui vão os testes
        double[][] a = {
            {1, 3, -2, 3.5},
            {2, 4, -4, 6},
            {-2, -1.5, 3, 3}
        };
        double[][] b = {
            {3, 2.5, 0, 0},
            {1, 2, 4, 2},
            {2, 1.5, 2, 2}
        };

        double[][] resp = subtraiMatrizes(a, b);

        for (int i = 0; i < resp.length; i++) {
            for (int j = 0; j < resp[i].length; j++) {
                System.out.print(resp[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
