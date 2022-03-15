/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.atividade;

/**
 *
 * @author s.lucas
 */
public class Jogador {

    /*Crie uma classe para representar um jogador de futebol,
com os atributos nome, posição, data de nascimento, nacionalidade, altura e peso. 
Crie os métodos públicos necessários para sets e gets e também um método para 
imprimir todos os dados do jogador. Crie um método para calcular a idade do 
jogador e outro método para mostrar quanto tempo falta para o jogador se
aposentar. Para isso, considere que os 
jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores
de meio-campo aos 38 e os atacantes aos 35.*/
    public String nome;
    public String posicao;
    public String nacionalidade;
    public int anoNasc;
    public double altura;
    public double peso;
    public int aposenta;
    public int idade;

    public Jogador() {
    }

    public void mostrarDados() {
        System.out.println("Nome:" + nome
                + "\nIdade:" + idade
                + "\nNacionalidade:" + nacionalidade
                + "\nAno de Nascimento:" + anoNasc
                + "\nAltura:" + altura
                + "\nPeso:" + peso
                + "\nPosição:" + posicao);
    }

    public void mostrarAposentadoria() {
        System.out.println(nome + " irá se aposentar em " + (aposenta - idade)
                + " anos");
    }

    public static void main(String[] args) {
        Jogador obj = new Jogador();
        obj.setNome("Ronaldinho");
        obj.setAnoNasc(1990);
        obj.setPeso(80);
        obj.setAlutra(180);
        obj.setPosicao("Meio Campo");
        obj.setNacionalidade("Brasileiro");
        obj.setIdade(0);
        obj.mostrarDados();
        obj.setAposenta(obj.aposenta);
        obj.mostrarAposentadoria();
    }

    public void setAposenta(int aposenta) {
        if (posicao.equals("Zagueiro")) {
            this.aposenta = 40;
        } else if (posicao.equals("Atacante")) {
            this.aposenta = 35;

        } else if (posicao.equals("Meio Campo")) {
            this.aposenta = 38;
        } else {
            System.out.println("Ensira uma posição compativel:Zagueiro,Atacante,Neio Campo!");
        }
    }

    public double getAposenta(int aposenta) {
        return aposenta;
    }

    public void setAlutra(double alutra) {
        this.altura = alutra;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = (2022 - anoNasc);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
        if (posicao.equals("Zagueiro")) {
        }

    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getAnoNasc() {
        return anoNasc;
    }
}

