/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author mborges
 */
public class Tamagotchi {
    private int id_tamagotchi;
    private String nome;
    private int idade;
    private int comida;
    private int energia;
    private int bem_estar;
    
    public Tamagotchi(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.comida = 100;
        this.energia = 100;
        this.bem_estar = 100;
    }

    public Tamagotchi(int id_tamagotchi, String nome, int idade, int comida, int energia, int bem_estar) {
        this.id_tamagotchi = id_tamagotchi;
        this.nome = nome;
        this.idade = idade;
        this.comida = comida;
        this.energia = energia;
        this.bem_estar = bem_estar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getBem_estar() {
        return bem_estar;
    }

    public void setBem_estar(int bem_estar) {
        this.bem_estar = bem_estar;
    }
    
    
}
