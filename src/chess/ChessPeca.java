package chess;

import tabuleirogame.Peca;
import tabuleirogame.Tabuleiro;

public class ChessPeca extends Peca {

	private Cor cor;

	public ChessPeca(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

}
