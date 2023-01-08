package padroescomportamentais;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    Cliente cliente;
    @BeforeEach
    void setUp() {
        cliente = new Cliente();
    }

    @AfterEach
    void tearDown() {
        cliente = null;
    }

    @Test
    void deveSomarConsumoCliente() {
        cliente.somarConsumo(355.0f, 498.0f);
        assertEquals(853.0f, cliente.getConsumoEnergia());
    }

    @Test
    void deveSubtrairConsumoCliente() {
        cliente.subtrairConsumo(312.0f, 236.0f);
        assertEquals(76.0f, cliente.getConsumoEnergia());
    }

    @Test
    void deveMultiplicarConsumoCliente() {
        cliente.multiplicarConsumo(300.0f, 1.1f);
        assertEquals(330.0f, cliente.getConsumoEnergia());
    }

    @Test
    void deveDividirConsumoCliente() {
        cliente.dividirConsumo(542.0f, 2.0f);
        assertEquals(271.0f, cliente.getConsumoEnergia());
    }

    @Test
    void naoDeveDividirConsumoClientePorZero() {
        try {
            cliente.dividirConsumo(350.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaConsumoCliente() {
        cliente.calcularMediaConsumos(452.0f, 546.0f);
        assertEquals(499.0f, cliente.getConsumoEnergia());
    }
}