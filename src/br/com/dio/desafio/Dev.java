package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> contedosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void InscreverBootcamp(Bootcamp bootcamp) {

    }

    public void progredir(){

    }

    public void calcularTotalXp() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getContedosInscritos() {
        return contedosInscritos;
    }

    public void setContedosInscritos(Set<Conteudo> contedosInscritos) {
        this.contedosInscritos = contedosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && contedosInscritos.equals(dev.contedosInscritos) && conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contedosInscritos, conteudosConcluidos);
    }
}
