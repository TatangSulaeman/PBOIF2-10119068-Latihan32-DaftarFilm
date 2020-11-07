/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.daftarfilm.tugas;

/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan daftar film
 */
public class Film {
    String filmName, filmGenre;
    Double filmRating ;
    int filmDuration ;
    
    public void nowPlaying() {
        String outputText=
                "Judul Film\t : " + filmName + "\n" + 
                "Genre Film\t : " + filmGenre + "\n" +
                "Rating Film\t : " + filmRating +  "\n" +
                "Duration Film\t : " + filmDuration + " Menit" + "\n" +
                "";
        System.out.println(outputText);
    }
}
