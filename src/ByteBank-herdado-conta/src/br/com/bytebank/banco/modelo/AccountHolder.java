public class AccountHolder {

    private Conta[] references;
    private int posicaoLivre;

    public AccountHolder(){
        this.references = new Conta[10];
        this.posicaoLivre = 0;

    }

    public void adiciona(Conta ref) {
        this.references[this.posicaoLivre] = ref;
        this.posicaoLivre++; 
    }

    public int getQtdElementos() {
        return this.posicaoLivre;
    }

    public Conta getReference(int pos) {
        return this.references[pos];
    }
}
