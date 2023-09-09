package br.com.alura.minhasmusicas.modelos;

public class Preferidos {
    public void Incluir(Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        } else if (audio.getClassificacao() >= 5) {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo");
        } else {
            System.out.println(audio.getTitulo() + " não é um dos mais curtidos");
        }
    }
}
