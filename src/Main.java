public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        TAD vetorTAD = new TAD();
        vetorTAD.preencherVetor(vetor);

        vetorTAD.preencherPosicao(vetor, 3, 2);
        vetorTAD.preencherPosicao(vetor, 4, 3);
        vetorTAD.preencherPosicao(vetor, 5, 4);
        vetorTAD.preencherPosicao(vetor, 6, 5);
        vetorTAD.preencherPosicao(vetor, 7, 6);

        vetorTAD.removerNaUltimaOcupada(vetor);

        vetorTAD.removerNaUltimaOcupada(vetor);
        vetorTAD.removerNaUltimaOcupada(vetor);
        vetorTAD.removerNaUltimaOcupada(vetor);
        vetorTAD.removerNaUltimaOcupada(vetor);
        vetorTAD.inserirNaPrimeiraVaga(vetor,2);
        vetorTAD.inserirNaPrimeiraVaga(vetor,6);

        vetorTAD.lerVetor(vetor);
    }
}