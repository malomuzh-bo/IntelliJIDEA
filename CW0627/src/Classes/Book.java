package Classes;

public class Book {
    private String title;
    private String authorName;
    private int yearOfPublication;
    private String publisherName;
    private String genre;
    private int numberOfPages;
    public Book(String title, String authorName, int yearOfPublication, String publisherName,
                String genre, int numberOfPages) {
        this.title = title;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
        this.publisherName = publisherName;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title, String authorName, int yearOfPublication, String genre, int numberOfPages) {
        this.title = title;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
        this.publisherName = "noname";
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }
    public void show(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + authorName);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Genre: " + genre);
        System.out.println("Number of Pages: " + numberOfPages);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}

