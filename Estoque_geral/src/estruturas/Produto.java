package estruturas;
import java.lang.Math;

public class Produto {
    private static double  sequence = Math.random();
    protected double id;
    protected String nome;
    protected int codigo;
    protected  String descricao;
    protected double preco;
    protected int qtd;
    protected String unidade;

    public Produto(String nome, int codigo, String descricao, double preco, int qtd, String unidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.qtd = qtd;
        this.unidade = unidade;
        this.id = sequence;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int decrementar(int menos, Produto P){
        this.qtd = P.getQtd() - menos;
        return this.qtd;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", qtd=" + this.qtd +
                ", unidade='" + unidade + '\'' +
                '}';
    }
}
