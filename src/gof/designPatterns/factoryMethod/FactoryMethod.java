package gof.designPatterns.factoryMethod;

class FactoryMethod {
    public Produto criarProduto(String tipo) {
        if (tipo.equalsIgnoreCase("A")) {
            return new ProdutoA();
        } else if (tipo.equalsIgnoreCase("B")) {
            return new ProdutoB();
        }
        return null;
    }
}