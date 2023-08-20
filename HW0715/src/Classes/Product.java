package Classes;

public class Product {
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String title, category;
    public Product(String title, String category){
        this.title = title;
        this.category = category;
    }
}
