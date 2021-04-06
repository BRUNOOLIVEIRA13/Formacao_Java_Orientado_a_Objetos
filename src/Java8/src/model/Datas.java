package Java8.src.model;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate eleicoesPresidente = LocalDate.of(2099, 01, 25);

        int anos = eleicoesPresidente.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, eleicoesPresidente);

        LocalDate proximasEleicoes = eleicoesPresidente.plusYears(4);
        System.out.println(proximasEleicoes);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(proximasEleicoes.format(formatter));

        DateTimeFormatter formatterHours = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatterHours));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);

        ZonedDateTime zoneTime = ZonedDateTime.now();
        System.out.println(zoneTime);

        String txt = """
                    SELECT * FROM
                    PRODUTO
                    INNER JOIN CLIENTE ...
                    """;

        List<String> nomes = List.of("nome1", "nome2", "nome3");

//        switch (nomes) {
//                case "nome1", "nome2", "nome3" -> System.out.println("Achou o nome: " + nomes);
//                default -> System.out.println("não achou nenhum nome");
//        }
//        record ClienteDTO(String nome, String cpf) {
//
//        }


    }

}