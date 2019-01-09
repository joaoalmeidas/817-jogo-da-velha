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
		
		System.out.println();
		
		for(int i = getTabuleiro().length - 1; i >= 0; i--) {
			
			System.out.printf("%d ", i);
			
			for(int j = 0; j < getTabuleiro()[0].length; j++) {
				
				if(getTabuleiro()[i][j] == Jogada.EMPTY) {
					
					System.out.printf(" ");
					
				}else if(getTabuleiro()[i][j] == Jogada.O) {
					
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
		
		System.out.printf("\n  ");
		
		for(int i = 0; i < getTabuleiro()[0].length; i++) {
			
			System.out.printf("%d ", i);
			
		}
		
	}
	
	
	
	public void posicionaJogada(int jogada) {
		
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0;
		
		do{
			
			System.out.println("\nInsira a sua jogada.");
			
			System.out.printf("Insira a coluna:");
			x = input.nextInt();
			
			System.out.printf("Insira a linha:");
			y = input.nextInt();
			
		}while(x < 0 || x >= getTabuleiro().length || y < 0 || y >= getTabuleiro().length || getTabuleiro()[y][x] == Jogada.O || getTabuleiro()[y][x] == Jogada.X);
		
		if(jogada % 2 == 0) {
			getTabuleiro()[y][x] = Jogada.O;
		}else {
			getTabuleiro()[y][x] = Jogada.X;
		}
		
	}
	
	public boolean verificaVencedor() {
		
		
		for(int i = 0; i < getTabuleiro().length; i++) {
			
			if(getTabuleiro()[i][0] != Jogada.EMPTY) {
				
				//verifica horizontal
				
				int cont = 0;
				
				for(int k = 0; k < getTabuleiro().length; k++) {
					
					if(getTabuleiro()[i][k] == getTabuleiro()[i][0]) {
						
						cont++;
						
					}
					
				}
				
				if(cont == getTabuleiro().length) {
					return true;
				}
				
			}
			
			
		}
		
		for(int i = 0; i < getTabuleiro()[0].length; i++) {
			
			if(getTabuleiro()[0][i] != Jogada.EMPTY) {
				
				//verifica vertical
				
				int cont = 0;
				
				for(int j = 0; j < getTabuleiro()[0].length; j++) {
					
					if(getTabuleiro()[0][i] == getTabuleiro()[j][i]) {
						
						cont ++;
						
					}
					
				}
				
				if(cont == getTabuleiro()[0].length) {
					
					return true;
					
				}
				
				
			}
			
		}
		
		if(getTabuleiro()[0][0] != Jogada.EMPTY) {
			
			int cont = 0;
			
			for(int i = 0; i < getTabuleiro().length; i++) {
				
				if(getTabuleiro()[0][0] == getTabuleiro()[i][i]) {
					
					cont++;
					
				}
				
			}
			
			if(cont == getTabuleiro().length) {
				
				return true;
				
			}
			
		}
		
		if(getTabuleiro()[2][0] != Jogada.EMPTY) {
			
			int cont = 0;
			
			for(int i = getTabuleiro().length - 1, j = 0; j < getTabuleiro().length; i--, j++) {
				
				if(getTabuleiro()[2][0] == getTabuleiro()[i][j]) {
					
					cont++;
					
				}
				
			}
			
			if(cont == getTabuleiro().length) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	public void iniciaPartida() {
		
		exibeTabuleiro();
		
		for(int jogada = 1; jogada <= getTabuleiro().length * getTabuleiro()[0].length && verificaVencedor() == false; jogada++) {
			
			posicionaJogada(jogada);
			
			exibeTabuleiro();
			
			if(verificaVencedor() == true) {
				
				System.out.println("\nHá vencedor.");
				
				exibeTabuleiro();
				
			}
			
		}
		
	}
	
	
	
	

}
