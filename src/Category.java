public class Category {
    public String name;
    public String slug;

    public Category(String name, String slug) {
        this.name = name;
        this.slug = slug;
    }

    public void getCategory(){
        System.out.println("Category name: "+ name);
    }
}

