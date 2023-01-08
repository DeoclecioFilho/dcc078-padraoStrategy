package padroescomportamentais;

public class Cliente {

    private float consumoEnergia;

    public float getConsumoEnergia() {
        return consumoEnergia;
    }


    public void somarConsumo(float consumoEnergia1, float consumoEnergia2) {
        Calculadora calculadora = new Calculadora(consumoEnergia1, consumoEnergia2);
        this.consumoEnergia = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairConsumo(float consumoEnergia1, float consumoEnergia2) {
        Calculadora calculadora = new Calculadora(consumoEnergia1, consumoEnergia2);
        this.consumoEnergia = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirConsumo(float consumoEnergia1, float consumoEnergia2) {
        Calculadora calculadora = new Calculadora(consumoEnergia1, consumoEnergia2);
        this.consumoEnergia = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarConsumo(float consumoEnergia1, float consumoEnergia2) {
        Calculadora calculadora = new Calculadora(consumoEnergia1, consumoEnergia2);
        this.consumoEnergia = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaConsumos(float consumoEnergia1, float consumoEnergia2) {
        Calculadora calculadora = new Calculadora(consumoEnergia1, consumoEnergia2);
        this.consumoEnergia = calculadora.calcular(new OperacaoMedia());
    }
}
