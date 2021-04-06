package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    // BeforeAll e AfterAll que rodam antes e após todos, precisam ser estáticos
    @BeforeAll
    public static void antesDeTodos() {
        System.out.println(" == Before All = Printa antes de todos! ==");
    }

    @AfterAll
    public static void depoisDeTodos(){
        System.out.println("== After All = Printa depois de todos! ==");
    }

    @BeforeEach
    public void inicializar() {
        System.out.println("Before Each = Printa antes de cada.");
        service = new ReajusteService();
        funcionario = new Funcionario("Nome Funcionário", LocalDate.now(), new BigDecimal("1000.00"));

    }

    @AfterEach
    public void finalizar() {
        System.out.println("After Each = printa ao final de cada.");
    }

    @Test
    public void reajusteDe3PorcentoDesempenhoADesejar() {

        service.reajusteSalarial(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDe15PorcentoDesempenhoBom() {

        service.reajusteSalarial(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDe20PorcentoDesempenhoOtimo() {

        service.reajusteSalarial(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
