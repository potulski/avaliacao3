
import java.util.Objects;



public class Contas {

    private int idConta;
    private int mes;
    private int ano;
    private double valor;

    public Contas() {
    }

    public Contas(int idConta, int mes, int ano, Double valor) {
        this.idConta = idConta;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
    }

    public int getIdConta() {
        return this.idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Contas idConta(int idConta) {
        this.idConta = idConta;
        return this;
    }

    public Contas mes(int mes) {
        this.mes = mes;
        return this;
    }

    public Contas ano(int ano) {
        this.ano = ano;
        return this;
    }

    public Contas valor(Double valor) {
        this.valor = valor;
        return this;
    }

   