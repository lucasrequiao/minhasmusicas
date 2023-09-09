package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musicas;
import br.com.alura.minhasmusicas.modelos.Podcasts;
import br.com.alura.minhasmusicas.modelos.Preferidos;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");
        minhaMusica.setGenero("Rock");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.Reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.Curtir();
        }

        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 2000; i++) {
            meuPodcast.Reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            meuPodcast.Curtir();
        }

        Preferidos preferido = new Preferidos();
        preferido.Incluir(minhaMusica);
        preferido.Incluir(meuPodcast);
    }
}
