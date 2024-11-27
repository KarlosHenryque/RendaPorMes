package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o nome do partamento:");
		String departamento = sc.nextLine();
		System.out.println("Nome:");
		String nomeTrabalhador = sc.nextLine();
		System.out.println("Nivel:");
		String nivelTrabalhador = sc.nextLine();
		System.out.println("Salario base:");
		double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(departamento));
		
		System.out.println("Quantos contratos esse trabalhador teve:");
		int n = sc.nextInt();
		
		for (int i=1; i<=
				n; i++) {
			System.out.println("\nInsira os dados do contrato " +i+ " :");
			System.out.print("Data (DD/MM/YYYY):");
			Date contratoDate = sdf.parse(sc.next());
			System.out.print("Valor por hora:");
			double valorHora = sc.nextDouble();
			System.out.print("Duração do contrato:");
			int horas = sc.nextInt();
			
			Contratos contrato = new Contratos(contratoDate, valorHora, horas);
			trabalhador.addContrato(contrato);
		}
		
		System.out.println("\nEntre com o mes e ano para calcular o salario (MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("\nNome: " +trabalhador.getNome());
		System.out.println("Departamento: " +trabalhador.getDepartamento().getNome());
		System.out.println("Renda para " +mesAno+ ": " +String.format("%.2f", trabalhador.renda(ano, mes)));
		
		sc.close();
	}

}
