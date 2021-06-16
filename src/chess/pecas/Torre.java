package chess.pecas;

import chess.ChessPeca;
import chess.Cor;
import tabuleirogame.Tabuleiro;

public class Torre extends ChessPeca {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "T";
	}
}
