package CadastroPet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Responsavel pessoa = new Responsavel(
                "Cleiton",
                "Pereira",
                "05883-260",
                "550",
                23,
                "jerfferson@mastertech.com.br",
                "99999-9999"
        );

        Pet cachorro = new Pet(
                "Toddy",
                "Cachorro",
                "Vira-Lata",
                24,
                "marrom",
                pessoa,
                Pet.TiposCuidado.Fisioterapia.toString()
        );

        pessoa.setNome("Cleiton");
        System.out.println(pessoa.getNome());

        System.out.println(pessoa.verificarMaioridade(pessoa.getIdade()));
        System.out.println(cachorro.retornarDadosPet());

    }
}