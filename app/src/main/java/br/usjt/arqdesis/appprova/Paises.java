package br.usjt.arqdesis.appprova;

import java.io.Serializable;

/**
 * Created by arqdsis on 05/05/2017.
 */
public class Paises implements Serializable{

    private int id;
    private String nome;
    private String foto;
    private String capital;
    private String area;
    private String populacao;
    private String modeda;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFoto() {
        String foto = this.nome.replace('@', '_');
        return foto.replace('.', '_');
    }

    public String getCapital() {
        return capital;
    }

    public String getArea() {
        return area;
    }

    public String getPopulacao() {
        return populacao;
    }

    public String getModeda() {
        return modeda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public void setModeda(String modeda) {
        this.modeda = modeda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paises paises = (Paises) o;

        if (id != paises.id) return false;
        if (nome != null ? !nome.equals(paises.nome) : paises.nome != null) return false;
        if (foto != null ? !foto.equals(paises.foto) : paises.foto != null) return false;
        if (capital != null ? !capital.equals(paises.capital) : paises.capital != null)
            return false;
        if (area != null ? !area.equals(paises.area) : paises.area != null) return false;
        if (populacao != null ? !populacao.equals(paises.populacao) : paises.populacao != null)
            return false;
        return modeda != null ? modeda.equals(paises.modeda) : paises.modeda == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (foto != null ? foto.hashCode() : 0);
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (populacao != null ? populacao.hashCode() : 0);
        result = 31 * result + (modeda != null ? modeda.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Paises{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", foto='" + foto + '\'' +
                ", capital='" + capital + '\'' +
                ", area='" + area + '\'' +
                ", populacao='" + populacao + '\'' +
                ", modeda='" + modeda + '\'' +
                '}';
    }
}
