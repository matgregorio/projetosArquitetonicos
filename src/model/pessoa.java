/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mateus Gregorio
 */
public class pessoa {
    private int id;
    private long cpf;
    private String nome;
    private endereco d;
    private String senha;
    
    public pessoa(){
        this.cpf= 0;
        this.nome= "";
        this.d = new endereco();
    }

}
