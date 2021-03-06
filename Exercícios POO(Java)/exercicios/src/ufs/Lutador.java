package ufs;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int empates;
	private int derrotas;
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int empates, int derrotas) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inv?lido. Pois o lutador est? abaixo peso";
		} else if(this.peso <= 70.3){
			this.categoria = "Leve";
		}else if(this.peso <= 83.9){
			this.categoria = "M?dio";
		}else if(this.peso <= 120.2){
			this.categoria = "Pesado";
		}else{
			this.categoria = "Inv?lido. Pois o lutador est? acima do peso";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public void apresentar() {
		System.out.println("=================================================");
		System.out.println("CHEGOU A HORA ! Apresento-lhes o lutador " + getNome());
		String aux = this.getNacionalidade();
        if (aux.substring(aux.length() - 1, aux.length()).equals("a")  && !aux.substring(aux.length() - 1, aux.length()).equals("Canad?")) {
            System.out.println("Diretamente da " + aux);
        } else{
            System.out.println("Diretamente do " + aux);
        }
		System.out.println("Com " + getIdade() + " anos, pesando " + getPeso() + "kg e " + getAltura() + " de altura"  );
		if (this.getVitorias() == 0 || this.getVitorias() == 1) {
			System.out.println(this.vitorias + " vit?ria");
		} else{
			System.out.println(this.vitorias + " vit?rias");
		}
		if (this.getEmpates() == 0 || this.getEmpates() == 1) {
			System.out.println(this.empates + " empate");
		} else {
			System.out.println(this.empates + " empates");
		}
		if (this.getDerrotas() == 0 || this.getDerrotas() == 1) {
			System.out.println(this.derrotas + " derrota");
		} else {
			System.out.println(this.derrotas + " derrotas");
		}
		System.out.println(" ");

	}
	
	public void status() {
		System.out.println(this.getNome() + " ? um peso " + this.getCategoria());
		if (getVitorias() == 0 || getVitorias() == 1) {
			System.out.println(this.getNome() + " venceu " + this.getVitorias() + " vez");
		} else {
			System.out.println(this.getNome() + " venceu " + this.getVitorias() + " vezes");
		}
		if (getEmpates() == 0 || getEmpates() == 1) {
			System.out.println(this.getNome() + " empatou " + this.getEmpates() + " vez");
		} else {
			System.out.println(this.getNome() + " empatou " + this.getEmpates() + " vezes");
		}
		if (getDerrotas() == 0 || getDerrotas() == 1) {
			System.out.println(this.getNome() + " perdeu " + this.getDerrotas() + " vez");
		} else {
			System.out.println(this.getNome() + " perdeu " + this.getDerrotas() + " vezes");
		}	
		System.out.println();

		}
	
	
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1); 
	}
	
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1); 
	}
}
