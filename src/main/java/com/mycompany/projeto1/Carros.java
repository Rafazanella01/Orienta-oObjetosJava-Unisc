/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto1;

/**
 *
 * @author rafazanella
 */
public class Carros {
    
    private String placa;
    private String modelo;
    private String fabricante;
    private int quilometragem;
    private int anoDeFabricacao;
    
    public Carros(String placa, String modelo, String fabricante, int quilometragem, int anoDeFabricacao)
    {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.quilometragem = quilometragem;
        this.anoDeFabricacao = anoDeFabricacao;
    }
    
    public void mostrar_dados()
    {
       System.out.println(this.placa);
       System.out.println(this.modelo);
       System.out.println(this.fabricante);
       System.out.println(this.quilometragem);
       System.out.println(this.anoDeFabricacao);
    }
    
    public void aumentar_km(int Km)
    {
        this.quilometragem = quilometragem + Km;
    }
    
    public int getkm()
    {
        return this.quilometragem;
    }
    
    public int getAno()
    {          
       return this.anoDeFabricacao;
    }
    
}
