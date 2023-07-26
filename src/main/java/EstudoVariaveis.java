public class EstudoVariaveis {
    // variável = container de dados
    // tipagem forte = definir o tipo de cada variável
    public static void main(String[] args) {
        // para definir uma váriavel
        // <tipo> <nome> = <valor>;

        // Tipos primitivos (surgiram com a linguagem): int, long, char, boolean, double, float
        // Tipos não-primitivos (foram implementados depois): String, List

        // Como declarar variáveis?
        int estoque = 150; // até 2 bilhões
        // L = sufixo para representar long
        long populacaoTerra = 790000000L; // até na casa dos quintilhões
        double salarioDev = 5500.99; // ate 15 casas de precisão
        // F = sufixo para representar float
        float nota = 7.5F; // até 7 casas de precisão
        boolean ativo = false; // true, false
        String nome = "José Almir"; // usamos aspas duplas sempre
        char letra = 'A'; // char = representa um único caractere e aspas simples

        // Tipagem forte
        int a = 1000;
        a = 2000; // reatribbuição/atualização
        // a = "batata"; // impossível atribuir outro tipo

        System.out.println("estoque: " + estoque);
        System.out.println("População da terra: " + populacaoTerra);
        System.out.println(nome);


    }
}
