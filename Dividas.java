



public class Dividas extends Contas {

    private double percDesconto;

    public Dividas() {
    }

    public Dividas(int idConta, int mes, int ano, double valor, double percDesconto) {
        super(idConta, mes, ano, valor);
        this.percDesconto = percDesconto;
    }

    public double getPercDesconto() {
        return this.percDesconto;
    }

    public void setPercDesconto(double percDesconto) {
        this.percDesconto = percDesconto;
    }

    public Dividas percDesconto(double percDesconto) {
        this.percDesconto = percDesconto;
        return this;
    }

  
}