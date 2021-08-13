package controle;

import dominio.DaoSessao;
import dominio.Sessao;

public class ControleJanelaSessao {
	private Sessao se = new Sessao(0, null, null, null);
	private DaoSessao daoSe = new DaoSessao();
	
	public void incluirSessao(int sala, String data, String hora, String filme) {
		se.setSala(sala);
		se.setData(data);
		se.setHora(hora);
		se.setFilme(filme);
		
		daoSe.inserir(sala, se.formatarData(), hora, filme);
	}
}
