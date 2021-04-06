package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.math.BigDecimal.ZERO;
import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
//Testará se retornará 0, caso o bonus seja superior a 1000, e salario > 10000;

    @Test
    void bonusZeroParaSalarioMuitoAlto() {
        BonusService service = new BonusService();

        // Atraves do assertThrows, eu passo a execption esperada e a execução do método
        assertThrows(IllegalArgumentException.class,
                () -> service.calcularBonus(new Funcionario("nome", LocalDate.now(), new BigDecimal("25000"))));

        // Forma alternativa de fazer é utilizando um bloco try-catch
        /*
        try {
            service.calcularBonus(new Funcionario("nome", LocalDate.now(), new BigDecimal("25000")));
            // fail abaixo é pra forçar uma falha antes de tratar a exeção
            fail("Era esperado uma exceção caso a conditação fosse verdadeira.");
        } catch (Exception e) {
            assertEquals("Não deverá receber bônus devido ao alto salário.", e.getMessage());
        }

         */
    }


    @Test
    void bonusDezPorCentoDoSalario() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario(
                "nome", LocalDate.now(), new BigDecimal("2500"))
        );

        assertEquals(new BigDecimal("250.00"), bonus);
    }


    @Test
    void bonusDezPorCentoParaSalarioExatoDe10mil() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario(
                "nome", LocalDate.now(), new BigDecimal("10000"))
        );

        assertEquals(new BigDecimal("1000.00"), bonus);
    }



}