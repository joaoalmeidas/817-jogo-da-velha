
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
	
	public void exibeTabuleiro() {
		
		for(int i = 0; i < tabuleiro.length; i++) {
			
			for(int j = 0; j < tabuleiro[0].length; j++) {
				
				if(tabuleiro[i][j] == Jogada.EMPTY) {
					
					System.out.printf(" ");
					
				}else if(tabuleiro[i][j] == Jogada.O) {
					
					System.out.printf("O");
					
				}else if(tabuleiro[i][j] == Jogada.X) {
					
					System.out.printf("X");
					
				}
				
				
				if(j != tabuleiro[0].length - 1) {
					
					System.out.printf("|");
					
				}
				
			}
			
			System.out.println();
			
		}
		
	}
	
	
	

}
