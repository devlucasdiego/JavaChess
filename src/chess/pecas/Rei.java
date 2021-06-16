package chess.pecas;

import chess.ChessPeca;
import chess.Cor;
import tabuleirogame.Tabuleiro;

public class Rei extends ChessPeca {

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "R";
	}
}
