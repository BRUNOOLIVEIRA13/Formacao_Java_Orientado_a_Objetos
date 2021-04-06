public class ReferenceHolder {

    private Object[] references;
    private int posicaoLivre;

    public ReferenceHolder(){
        this.references = new Object[10];
        this.posicaoLivre = 0;

    }

    public void adiciona(Object ref) {
        this.references[this.posicaoLivre] = ref;
        this.posicaoLivre++; 
    }

    public int getQtdElementos() {
        return this.posicaoLivre;
    }

    public Object getReference(int pos) {
        return this.references[pos];
    }
}
