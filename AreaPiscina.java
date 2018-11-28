class AreaPiscina {
    // Materias da piscina
    static final int alvenaria = 0;
    static final int vinil = 1;
    static final int fibra = 2;
    static final int plastico = 3;

    // Preço dos materiais
    static double[] precos = {1500, 1100, 750, 500};

    // Nomes dos materiais
    static char[][] nomes = {
        {'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a'},
        {'V', 'i', 'n', 'i', 'l'},
        {'F', 'i', 'b', 'r', 'a'},
        {'P', 'l', 'a', 's', 't', 'i', 'c', 'o'}
    };

    // Calcula a área da piscina
    static double area(double raio){
        return (raio >= 0 ? (Math.PI * Math.pow(raio, 2)) : -1);
    }

    // Calcula o valor do metro quadrado para piscina
    static double valor(double area, int material){
        if(material < alvenaria || material > plastico || area < 0)
            return(-1);

        return (area * precos[material]);
    }

    // Retorna a matriz com os preços finais.
    // Parâmetros:
    //     val - matriz de valores
    //     desc - matriz de descontos
    static double[][] calculaFinal(double[][] val, double[][] desc){
        double[][] saida = new double[val.length][val[0].length];

        for(int i = 0; i < saida.length; i++){
            for(int j = 0; j < saida[0].length ; j++){
                saida[i][j] = val[i][j] * (1 - desc[i][j]);
            }
        }

        return (saida);
    }

    // Carrega os valores das piscinas na matriz de área x material
    static void carregaVal(double[][] m){
        for(int i = 0; i < m.length; i++){ //Linhas material
            for(int j = 50; j <= 200; j += 50){ //Colunas áreas
                m[i][j / 50 - 1] = valor(j, i);
            }
        }
    }

    public static void main(String[] args){
        // Aqui vão os testes

    }
}
