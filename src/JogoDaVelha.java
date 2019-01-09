import java.util.Scanner;

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
		
		for(int i = tabuleiro.length - 1; i >= 0; i--) {
			
			System.out.printf("%d", i);
			
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
		
		System.out.printf(" ");
		
		for(int i = 0; i < tabuleiro[0].length; i++) {
			
			System.out.printf("%d ", i);
			
		}
		
	}
	
	
	
	public void posicionaJogada(int jogada) {
		
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0;
		
		do{
			
			System.out.println("\nInsira a sua jogada.");
			
			x = input.nextInt();
			y = input.nextInt();
			
		}while(x < 0 || x >= tabuleiro.length || y < 0 || y >= tabuleiro.length || tabuleiro[y][x] == Jogada.O || tabuleiro[y][x] == Jogada.X);
		
		if(jogada % 2 == 0) {
			tabuleiro[y][x] = Jogada.O;
		}else {
			tabuleiro[y][x] = Jogada.X;
		}
		
	}
	
	
	
	

}
