package modelo;

/*
 * Professor Gerson Risso
 */
public interface Observados {
    void registrarObservadores(Observadores observadores);
    void removerObservadores(Observadores observadores);
    void notificarObservadores(String mensagem);
}
