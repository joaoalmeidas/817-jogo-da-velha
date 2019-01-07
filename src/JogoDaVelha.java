
public class JogoDaVelha {
	
	private Jogada[][] tabuleiro = new Jogada[3][3];

	public JogoDaVelha() {
		super();
		for(int i = 0; i < tabuleiro.length; i++) {
			
			for(int j = 0; j < tabuleiro[0].length; j++) {
				
				tabuleiro[i][j] = Jogada.EMPTY;
				
			}
			
		}
	}

	public Jogada[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Jogada[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	
	
	
	

}
