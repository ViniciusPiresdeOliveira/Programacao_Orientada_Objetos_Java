package exercicios;

public class CalculadoraSalario {

	public static void main(String[] args) {
		String nome = "Vin�cius";
		double salario = 2403.25;
		
		if (salario <= 1751.81) {
			System.out.println("Voc� recebe R$" + salario + " de sal�rio.\nCom o desconto do INSS voc� receber� R$" + (salario - (salario*0.08)));
			
		}else if(salario > 1751.82 && salario < 2919.72) {
			System.out.println("Voc� recebe R$" + salario + " de sal�rio.\nCom o desconto do INSS voc� receber� R$" + (salario - (salario*0.09)));

	}else if(salario > 2919.73 && salario < 5839.45) {
		System.out.println("Voc� recebe R$" + salario + " de sal�rio.\nCom o desconto do INSS voc� receber� R$" + (salario - (salario*0.1)));

	}else if(salario > 5839.456) {
		System.out.println("Voc� recebe R$" + salario + " de sal�rio.\nCom o desconto do INSS voc� receber� R$" + (salario - (salario*0.11)));
}
	
}
}
