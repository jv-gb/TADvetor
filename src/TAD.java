public class TAD {
    public void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = -99;
        }

    }

    public void preencherPosicao(int[] vetor, int posicao, int numero) {
        if (numero < 10 && numero >= 0) {
            vetor[posicao] = numero;
            return;
        }
        System.out.println("Número fora do intervalo de 0 a 10");
    }

    public void removerPosicao(int[] vetor, int posicao) {

        vetor[posicao] = -99;
    }

    public void lerPosicao(int[] vetor, int posicao) {
        System.out.println(vetor[posicao]);
    }

    public void lerVetor(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public void inserirNaPrimeiraVaga(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == -99) {
                vetor[i] = numero;
                break;
            }
        }
    }
    public void removerNaUltimaOcupada(int[] vetor) {
        for (int i = vetor.length -1; i >= 0; i--) {
            if (vetor[i] != -99) {
                vetor[i] = -99;
                break;
            }
        }
    }

}
