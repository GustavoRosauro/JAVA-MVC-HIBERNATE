/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Usuario
 */
@Entity(name = "Usuarios")
public class Usuarios {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int Id;
    @Column
    private String Nome;
    @Column
    private float Peso;
    @Column
    private int Idade;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
}
