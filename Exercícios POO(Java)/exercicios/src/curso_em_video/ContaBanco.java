package curso_em_video;

public class ContaBanco {

	// Atributos
	private int numConta;
	private String tipo;
	private String donoConta;
	private double saldo;
	private String status;

	public void estadoAtual() {
		System.out.println("=========================");
		System.out.println("Conta: " + getNumConta());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Dono: " + getDonoConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Status:" + getStatus());
		System.out.println("=========================");

	}

	// Método Construtor
	public ContaBanco(int numConta, String donoConta) {
		this.numConta = numConta;
		this.donoConta = donoConta;

	}

	// Métodos Especiais
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDonoConta() {
		return donoConta;
	}

	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// Métodos personalizados
	public void abrirConta(String tipo, String status) {
		setTipo(tipo);
		setStatus("V");
		if (tipo == "CC") {
			setSaldo(50);
		} else if (tipo == "CP") {
			setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}

	public void fecharConta(int saldo) {
		if ((getSaldo() < (0))) {
			System.out.println("Você está em débito");
		} else if ((getSaldo() < (0))) {
			System.out.println("Você deve sacar o seu dinheiro");
		} else {
			setStatus("F");
			System.out.println("Conta fechada co sucesso");
		}

	}

	public void depositar(double valor) {
		if ((getStatus() == ("V"))) {
			setSaldo(getSaldo() + valor);
			System.out.println("Depósito efetuado com sucesso na conta de " + getDonoConta());
		} else {
			System.out.println("Você não tem conta nesse banco");
		}
	}

	public void sacar(double valor) {
		if (getStatus() == "V" && getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque efetuado com sucesso na conta de " + getDonoConta());
		} else {
			System.out.println("Saque inválido");

		}
	}

	public void pagarMensal() {
		double valor;
		if (getTipo() == "CC") {
			valor = 12;
		} else {
			valor = 15;
		}
		if (getStatus() == "V" && getSaldo() > valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Mensalidade paga com sucessor por " + getDonoConta());
		} else {
			System.out.println("Pagamento inválido");
		}

	}
}
