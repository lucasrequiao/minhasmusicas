package br.com.alura.minhasmusicas.modelos;

public class Musicas extends Audio{
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalReproducoes() > 1000){
            return 10;
        } else if (this.getTotalReproducoes() > 500) {
            return 5;
        }else {
            return 1;
        }
    }
}
