public class Patron {
    public String name;
    public int id;
    public String type;

    public Patron(String name, int id, String type){
       this.name = name;
       this.id = id;
       this.type = type;
    }

    public void getPatronDetails(){
        System.out.println("Patron name: "+ name);
        System.out.println("Member Type: "+type);
        System.out.println();
    }
}
