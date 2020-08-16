import java.util.Random;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		
		if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
		
	}
	
	public void lutar() {
		
		if (this.isAprovada()) {
			desafiado.apresentar();
			desafiante.apresentar();
			
			Random aleatorio = new Random();
			
			int vencedor = aleatorio.nextInt(3);
			
			switch (vencedor) {
			case 0:
				System.out.println("-------------------------------------");
				System.out.println("A luta empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1:
				System.out.println("-------------------------------------");
				System.out.println("O " + this.desafiado.getNome() + " venceu a luta!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2:
				System.out.println("-------------------------------------");
				System.out.println("O " + this.desafiante.getNome() + " venceu a luta!");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
				

			default:
				break;
			}
		}else {
			System.out.println("A luta não foi aprovada...");
		}
		
	}
	
	private Lutador getDesafiado() {
		return desafiado;
	}

	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	private Lutador getDesafiante() {
		return desafiante;
	}

	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	private int getRounds() {
		return rounds;
	}

	private void setRounds(int rounds) {
		this.rounds = rounds;
	}

	private boolean isAprovada() {
		return aprovada;
	}

	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	

}
