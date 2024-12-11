class Book{
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title,String author,int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public java.lang.String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

}