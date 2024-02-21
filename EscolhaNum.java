import java.util.Random; // Importação Aletório
import java.util.ArrayList; // Importação  Lista Encadenada
import java.util.List; // Importação Lista
import java.util.Scanner; // Importação leitura de dados do usuário

// Classe Escolha Aleatório
public class EscolhaNum {
    public static List<Integer> gerarListaRandom(int size) {
        List<Integer> listaRandom = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            listaRandom.add(random.nextInt(100) + 1); // Adiciona um número aleatório entre 1 e 100 à lista
        }
        return listaRandom;
    }
// Função Par, Impar e Multiplos de 3
    public static void verificarNumero(int numero) {
        System.out.println("---Resultado----");
        if (numero % 3 == 0) { // Verifica se o número é múltiplo de 3
            System.out.println(numero + " É multiplo de 3");
        }
        if (numero % 2 == 0) { // Verifica se o número é par
            System.out.println(numero + " É Par");
        } else { // Se não for par, então é ímpar
            System.out.println(numero + " É Impar");
        }
    }
// Função Principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Tamanho da lista");
        int size = scanner.nextInt();
        List<Integer> listaRandom = gerarListaRandom(size); //  Chama função para gerar o resultado 
        System.out.println("Lista foi Gerada: " + listaRandom); // mostra a lista 

        for (int numero : listaRandom) {
            verificarNumero(numero);
        }
    }
}
