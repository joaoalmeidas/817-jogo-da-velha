
public class JogoDaVelhaTeste {

	public static void main(String[] args) {
		
		JogoDaVelha velha = new JogoDaVelha();
		
		
		velha.exibeTabuleiro();
		
		for(int jogada = 1; jogada <= velha.getTabuleiro().length * velha.getTabuleiro()[0].length; jogada++) {
			
			velha.posicionaJogada(jogada);
			
			velha.exibeTabuleiro();
			
		}

	}

}
