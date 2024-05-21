package estruturas;
import estruturas.Movimentacao;

public class Usuario extends Movimentacao{
    protected String username;
    private String senha;
    protected String papel;

    public Usuario(String nome, int codigo, String descricao, double preco, int qtd, String unidade, String tipo, String data, Produto p, String username, String senha, String papel) {
        super(nome, codigo, descricao, preco, qtd, unidade, tipo, data, p);
        this.username = username;
        this.senha = senha;
        this.papel = papel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return "ERRO - ACESSO NEGADO";
    }

    public String setSenha(String senha) {
        return "ERRO - ACESSO NEGADO";
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "P=" + P +
                ", data='" + data + '\'' +
                ", tipo='" + tipo + '\'' +
                ", papel='" + papel + '\'' +
                ", senha= ----- "  + '\'' +
                ", username=" + username +
                '}';
    }
}
