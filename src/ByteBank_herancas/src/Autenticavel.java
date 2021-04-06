package ByteBank_herancas.src;// UMA INTERFACE NAO PODE HAVER NADA CONCRETO, TODOS OS MÉTODOS SÃO ABSTRATOS
    // Contrato Autenticavel
        // quem assinar esse contrato, precisa implementar:
            // método setSenha
            // método autentica

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
