public class Album {
    private long id;
    private String artist;
    private String name;
    private int release_date;
    private String genre;
    private double sales;

    public Album(int id, String the_beatles, char c, int release_date, String rock, double sales) {}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

    public Album(long id, String artist, String name, int release_date, String genre, double sales) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.genre = genre;
        this.sales = sales;
    }
