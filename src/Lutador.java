
public class Lutador implements CompRing {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	//construtor
	public Lutador(String no, String na, int id, double alt, double pe, int vit, int der, int emp) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setAltura(alt);
		this.setPeso(pe);
		this.setVitorias(vit);
		this.setDerrotas(der);
		this.setEmpates(emp);
	}
	
	
	//getters e setters
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getNacionalidade() {
		return nacionalidade;
	}
	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	private int getIdade() {
		return idade;
	}
	private void setIdade(int idade) {
		this.idade = idade;
	}
	private double getAltura() {
		return altura;
	}
	private void setAltura(double altura) {
		this.altura = altura;
	}
	private double getPeso() {
		return peso;
	}
	private void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	private String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.getPeso() < 52) {
			this.categoria = "Invalido";
		}else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		}else if (this.getPeso() <= 83.9) {
			this.categoria = "Peso Medio";
		}else if (this.getPeso() <= 120.2) {
			this.categoria = "Peso Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}
	private int getVitorias() {
		return vitorias;
	}
	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	private int getDerrotas() {
		return derrotas;
	}
	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	private int getEmpates() {
		return empates;
	}
	private void setEmpates(int empates) {
		this.empates = empates;
	}


	
	//metodos especificos

	@Override
	public void apresentar() {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------------------");
		System.out.println("CHEGOU A HORA!!! Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " idade.");
		System.out.println("A altura: " + this.getAltura());
		System.out.println("O peso: " + this.getPeso());
		System.out.println("A sua categoria: " + this.getCategoria());
		System.out.println("O numero de vitorias: " + this.getVitorias());
		System.out.println("O numetro de derrotas: " + this.getDerrotas());
		System.out.println("O numero de empates: " + this.getEmpates());
	}



	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println(this.getNome() + " é um peso de " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perde " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}



	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		
	}



	@Override
	public void perderLuta() {
		// TODO Auto-generated method stub
		this.setDerrotas(this.getDerrotas() + 1); 
	}



	@Override
	public void empatarLuta() {
		// TODO Auto-generated method stub
		this.setEmpates(this.getEmpates() + 1);
	}
	
	

}
