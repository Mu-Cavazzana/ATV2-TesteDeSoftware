import org.example.Produto;
import org.example.ServicoProduto;
import org.junit.Assert;
import org.junit.Test;

public class TesteServicoProduto {

    @Test
    public void testeProdutoValido() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Uva");
        produto.setDescricao("Uva verde");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1);
        produto.setQuantidadeEmEstoque(60);

        Assert.assertTrue(ServicoProduto.validarProduto(produto));

        System.out.println("Testes de produto válido realizado com sucesso!");
    }

    @Test
    public void testeProdutoInvalido() {
        Produto produto = new Produto();
        Assert.assertFalse(ServicoProduto.validarProduto(produto));

        System.out.println("Testes de produto inválido realizado com sucesso!");
    }

    @Test
    public void testeCadastroProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Uva");
        produto.setDescricao("Uva verde");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1);
        produto.setQuantidadeEmEstoque(60);

        Assert.assertTrue(ServicoProduto.cadastrarProduto(produto));

        System.out.println("Testes de cadastro realizado com sucesso!");
    }

    @Test
    public void testeEditarProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Uva");
        produto.setDescricao("Uva verde");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1);
        produto.setQuantidadeEmEstoque(60);

        ServicoProduto.cadastrarProduto(produto);

        produto.setNome("Melancia");
        produto.setPrecoUnitario(2.5);

        Assert.assertTrue(ServicoProduto.editarProduto(produto));

        System.out.println("Testes de edição realizado com sucesso!");
    }

    @Test
    public void testeExcluirProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Uva");
        produto.setDescricao("Uva verde");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1);
        produto.setQuantidadeEmEstoque(60);

        ServicoProduto.cadastrarProduto(produto);

        Assert.assertTrue(ServicoProduto.excluirProduto(1));

        System.out.println("Testes de exclusão realizado com sucesso!");
    }

    @Test
    public void testeConsultarProduto() {
        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNome("Uva");
        produto.setDescricao("Uva verde");
        produto.setCategoria("Fruta");
        produto.setPrecoUnitario(1);
        produto.setQuantidadeEmEstoque(60);

        ServicoProduto.cadastrarProduto(produto);

        Assert.assertEquals("Uva", ServicoProduto.consultarProduto(1).getNome());

        System.out.println("Testes de consulta realizado com sucesso!");
    }
}
