package ProdutosG2;



    public class ProdutosG2<T,U> {

        private T codigo;
        private String descricao;
        private U preco;

        public ProdutosG2() {

        }

        public ProdutosG2(T cod, String descr, U pr) {
            codigo = cod;
            descricao = descr;
            preco = pr;
        }

        public T getCodigo() { return codigo; }
        public String getDescricao() { return descricao; }
        public U getPreco() { return preco; }

        @Override
        public String toString() {
            return "ProdutoG2 {" + "codigo=" + codigo + ", descricao=" +
                    descricao + ", preco= " + preco + "}";
        }
    }





