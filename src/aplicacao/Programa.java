package aplicacao;

import chess.ChessPartida;

public class Programa {

	public static void main(String[] args) {

		ChessPartida chessPartida = new ChessPartida();
		UI.printTabuleiro(chessPartida.getPecas());
	}

}
