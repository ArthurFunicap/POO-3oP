package Atividade3;

import java.util.Scanner;

public class Questao23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String data;
		String[] dataAux;
		int dia, mes, ano, tam, i, iAux;
		
		String[] diaAux = new String[2];
		String[] mesAux = new String[2];
		String[] anoAux = new String[4];
		
		String diaAux2 = "";
		String mesAux2 = "";
		String anoAux2 = "";
		
		System.out.print("Digite uma data no formato dd/mm/aaaa: ");
		data = input.next();
		
		tam = data.length();
		dataAux = new String[tam];
		dataAux[0] = data;
		
		for(i = 0; i < 2; i++)
			diaAux[i] = dataAux[i];
		
		iAux = i+1;
		
		for(i = 0; i < 2; i++) {
			mesAux[i] = dataAux[iAux];
			iAux++;
		}
		
		iAux++;
		
		for(i = 0; i < 4; i++) {
			anoAux[i] = dataAux[iAux];
			iAux++;
		}
		
		for(String string : diaAux) {
			diaAux2 += string;
		}
		
		for(String string : mesAux) {
			mesAux2 += string;
		}
		
		for(String string : anoAux) {
			anoAux2 += string;
		}
		
		dia = Integer.parseInt(diaAux2);
		mes = Integer.parseInt(mesAux2);
		ano = Integer.parseInt(anoAux2);
		
		System.out.printf("Dia: %d\n", dia);
		System.out.printf("Mês: %d\n", mes);
		System.out.printf("Ano: %d\n", ano);
		
		input.close();
	}
}
