package gof.designPatterns.factoryMethod;

class ProdutoB implements Produto {
    @Override
    public void exibir() {
        System.out.println("Produto B");
    }
}