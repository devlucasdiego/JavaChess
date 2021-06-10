package aplicacao;

import chess.ChessPartida;
import tabuleirogame.Tabuleiro;

public class Programa {

	public static void main(String[] args) {

		ChessPartida chessPartida = new ChessPartida();
		UI.printTabuleiro(chessPartida.getPecas());
	}

}
