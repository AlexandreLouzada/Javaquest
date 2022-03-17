package dominio;

import java.util.ArrayList;
import java.util.List;

public class Colecionador {

    private String nome;
    private List<Carro> colecao;

    public Colecionador(String nome) {
        this.nome = nome;
        colecao = new ArrayList<Carro>();
    }

    public String getNome() {
        return nome;
    }

    public List<Carro> getColecao() {
        return colecao;
    }

    public void adicionarCarro(Carro carro) {
        colecao.add(carro);
    }

    public int obterAnoDoCarroMaisAntigo() {
        int maisAntigo = Integer.MAX_VALUE;

        for (Carro carro: colecao) {
            if (carro.getAnoLancamento() < maisAntigo) {
                maisAntigo = carro.getAnoLancamento();
            }
        }

        return maisAntigo;
    }
}