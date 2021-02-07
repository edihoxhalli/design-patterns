package creational.builder;

public class Book {

    private String title;
    private String author;
    private Type type;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type=" + type +
                ", pages=" + pages +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public Type getType() {
        return type;
    }

    public int getPages() {
        return pages;
    }

    private int pages;

    private Book(Builder builder){
        this.title = builder.title;
        this.author = builder.author;
        this.type = builder.type;
        this.pages = builder.pages;
    }

    public static class Builder {
        private String title;
        private String author;
        private Type type;
        private int pages;

        //mandatory title and author
        public Builder(String title, String author){
            this.title = title;
            this.author = author;
        }

        public Builder type(Type type){
            this.type = type;
            return this;
        }

        public Builder pages(int pages){
            this.pages = pages;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }

    public enum Type {
        SCIENCE_FICTION, COMPUTER_SCIENCE, FICTION
    }
}
