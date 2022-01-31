package br.com.dio.desafio.dominio;

import java.time.LocalDate;
//encapsulamento
public class Mentoria extends Conteudo {
 //   private String titulo;
 //   private String descricao;
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO = 20d;
    }

    //Construtor abaixo
    public Mentoria() {
    }

/*    //getter e setter abaixo
//    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
*/
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
//toString

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}