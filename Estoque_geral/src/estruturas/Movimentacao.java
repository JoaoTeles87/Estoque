package estruturas;
import estruturas.Produto;

public class Movimentacao extends Produto{

    protected String tipo;
    protected String data;
    protected Produto P;


    public Movimentacao(String nome, int codigo, String descricao, double preco, int qtd, String unidade, String tipo, String data, Produto p) {

        super(nome, codigo, descricao, preco, qtd, unidade);
        this.tipo = tipo;
        this.data = data;
        this.P = p;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Produto getP() {
        return P;
    }



    public void setP(Produto p) {
        P = p;
    }


    @Override
    public String toString() {
        return "Movimentacao{" +
                "tipo='" + tipo + '\'' +
                ", data=" + data +
                ", \t[P=" + P + "]\t" +
                '}';
    }
}
