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
 * Deskripsi program    : Menampilkan Daftar Film
 */
public class Main {
    public static void main(String[] args){
        System.out.println("----------Daftar Film Sedang tayang----------");
        Film dataFilm = new Film();
        
        dataFilm.filmName = "Venom" ;
        dataFilm.filmGenre = "Action, Horor, Scifi" ;
        dataFilm.filmRating = 8.5 ;
        dataFilm.filmDuration = 120 ;
        dataFilm.nowPlaying();
        
        dataFilm.filmName = "Small Foot" ;
        dataFilm.filmGenre = "Animation" ;
        dataFilm.filmRating = 9.0 ;
        dataFilm.filmDuration = 96 ;
        dataFilm.nowPlaying();
        
        dataFilm.filmName = "Crazy Rich Asian" ;
        dataFilm.filmGenre = "Comedy" ;
        dataFilm.filmRating = 7.8 ;
        dataFilm.filmDuration = 119;
        dataFilm.nowPlaying();
        
        dataFilm.filmName = "Asih" ;
        dataFilm.filmGenre = "Horror" ;
        dataFilm.filmRating = 6.0 ;
        dataFilm.filmDuration = 100;
        dataFilm.nowPlaying();
        
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}

