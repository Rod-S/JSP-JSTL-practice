import java.util.ArrayList;
import java.util.List;

public class ListAlbumsDao implements Albums {
    private List<Album> albums;

    public List<Album> all() {
        if (albums == null) {
            albums = generateAlbums();
        }
        return albums;
    }
    private List<Album> generateAlbums() {
        List<Album> albums = new ArrayList<>();
         albums.add(new Album(1,"Michael Jackson", "Thriller", 1982, "Pop, Rock, R&B", 47.3));
         albums.add(new Album(2, "AC/DC", "Back in Black", 1980, "Hard rock", 26.1));
         albums.add(new Album(3, "Pink Floyd", "The Dark Side of the Moon", 1973, "Progressive rock", 24.2));
         albums.add(new Album(4, "Meat Loaf", "Bat Out of Hell", 1977, "Hard rock, Progressive rock", 21.5));
         albums.add(new Album(5, "Whitney Houston / Various artists", "The Bodyguard", 1992, "R&B, Soul, Pop, Soundtrack", 28.4));
         albums.add(new Album(6, "Eagles", "Their Greatest Hits (1971–1975)", 1976, "Rock, Soft rock, Folk rock", 32.2));
         albums.add(new Album(7, "Bee Gees / Various artists", "Saturday Night Fever", 1977, "Disco", 21.6));
         albums.add(new Album(8, "Fleetwood Mac", "Rumours", 1977, "Soft rock", 27.9));
         albums.add(new Album(9, "Various artists", "Grease: The Original Soundtrack from the Motion Picture", 1978, "Soundtrack", 14.4));
         albums.add(new Album(10, "Led Zeppelin", "Led Zeppelin IV", 1971, "Hard rock, Heavy metal, Folk", 29.0));
         albums.add(new Album(11, "Michael Jackson", "Bad", 1987, "Pop, Funk, Rock", 19.3));
         albums.add(new Album(12, "Alanis Morissette", "Jagged Little Pill", 1995, "Alternative rock", 24.4));
         albums.add(new Album(13, "Shania Twain", "Come On Over", 1997, "Country, Pop", 29.6));
         albums.add(new Album(14, "Celine Dion", "Falling into You", 1996, "Pop, Soft rock", 20.2));
         albums.add(new Album(15, "The Beatles", "Sgt. Pepper's Lonely Hearts Club Band", 1967, "Rock", 13.1));
         albums.add(new Album(  16, "Eagles", "Hotel California", 1976, "Rock, Soft rock, Folk rock", 21.5));
         albums.add(new Album(17, "Various artists", "Dirty Dancing", 1987, "Pop, Rock, R&B", 17.9));
         albums.add(new Album(18, "Adele", "21", 2011, "Pop, Soul", 25.3));
         albums.add(new Album(19, "Celine Dion", "Let's Talk About Love", 1997, "Pop, Soft rock", 19.3));
         albums.add(new Album(20, "The Beatles", '1', 2000, "Rock", 22.6));
         albums.add(new Album(21, "Michael Jackson", "Dangerous", 1991, "Rock, Funk, Pop", 16.3));
         albums.add(new Album(22, "Madonna", "The Immaculate Collection", 1990, "Pop, Dance", 19.4));
         albums.add(new Album(23, "The Beatles", "Abbey Road", 1969, "Rock", 14.4));
         albums.add(new Album(24, "Bruce Springsteen", "Born in the U.S.A.", 1984, "Rock", 19.6));
         albums.add(new Album(25, "Dire Straits", "Brothers in Arms", 1985, "Rock, Pop", 17.7));
         albums.add(new Album(26, "James Horner", "Titanic: Music from the Motion Picture", 1997, "Soundtrack", 18.1));
         albums.add(new Album(27, "Metallica", "Metallica", 1991, "Thrash metal, Heavy metal", 21.2));
         albums.add(new Album(28, "Nirvana", "Nevermind", 1991, "Grunge, Alternative rock", 16.7));
         albums.add(new Album(29, "Pink Floyd", "The Wall", 1979, "Progressive rock", 17.6));
         albums.add(new Album(30, "Santana", "Supernatural", 1999, "Rock", 20.5));
         albums.add(new Album(31,"Guns N'' Roses", "Appetite for Destruction", 1987, "Hard rock", 21.6));
        return albums;
    }
}
