/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabalho_matematica;

/**
 *
 * @author keroly
 */
import java.util.Scanner;

public class SistemaAutomacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de automação!");
        System.out.println("Por favor, escolha o tipo de cálculo:");
        System.out.println("1. Sistema de Automação Constanta (SAC)");
        System.out.println("2. Sistema de Automação Francês (PRICE)");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1 -> calcularSAC(scanner);
            case 2 -> calcularPRICE(scanner);
            default -> System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }
    }

    public static void calcularSAC(Scanner scanner) {
        System.out.println("Você escolheu o Sistema de Automação Constanta (SAC).");
        System.out.println("Por favor, informe os valores necessários:");

        System.out.print("Valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Taxa de juros anual(%): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Número de parcelas: ");
        int numParcelas = scanner.nextInt();

        double valorParcela = valorEmprestimo / numParcelas;
        double jurosParcela = (valorEmprestimo * taxaJuros / 100) / numParcelas;

        System.out.println("Resultado:");
        System.out.println("Valor da parcela: " + valorParcela);
        System.out.println("Valor dos juros da parcela: " + jurosParcela);
    }

    public static void calcularPRICE(Scanner scanner) {
        System.out.println("Você escolheu o Sistema de Automação Francês (PRICE).");
        System.out.println("Por favor, informe os valores necessários:");

        System.out.print("Valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Taxa de juros(%): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Número de parcelas: ");
        int numParcelas = scanner.nextInt();

        double taxaJurosMensal = taxaJuros / 100 / 12;
        double valorParcela = (valorEmprestimo * taxaJurosMensal) / (1 - Math.pow(1 + taxaJurosMensal, -numParcelas));

        System.out.println("Resultado:");
        System.out.println("Valor da parcela: " + valorParcela);
    }
}


