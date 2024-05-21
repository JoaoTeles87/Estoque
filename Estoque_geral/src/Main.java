import estruturas.Fornecedor;
import estruturas.Usuario;
import estruturas.Produto;
import estruturas.Movimentacao;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Produto feijaoGrande = new Produto("Feijão Turquesa", 123, "Vence dia 20", 12.99, 321, "Suape");
        Produto comprar = new Movimentacao(feijaoGrande.getNome(), feijaoGrande.getCodigo(), feijaoGrande.getDescricao(), feijaoGrande.getPreco(), feijaoGrande.getQtd(), feijaoGrande.getUnidade(), "retirar", "21/01/2023", feijaoGrande);
        //System.out.println("Valor do produto 1: " + feijaoGrande.getId());
       ///System.out.println(feijaoGrande);
        System.out.println( comprar);
        comprar.decrementar(21, feijaoGrande);
        int novo_valor = comprar.getQtd();
        feijaoGrande.setQtd(novo_valor);
        System.out.println(comprar.getQtd());
        System.out.println(feijaoGrande.getQtd());
        Movimentacao joao = new Usuario(comprar.getNome(), comprar.getCodigo(), comprar.getDescricao(), comprar.getPreco(), comprar.getQtd(), comprar.getUnidade(),"retirar", "21/01/2023", feijaoGrande, "Jooao87", "@3$@#", "Chefinho");
        System.out.println(joao);

        joao.decrementar(100, feijaoGrande);
        System.out.println(feijaoGrande.getQtd());
    }
}