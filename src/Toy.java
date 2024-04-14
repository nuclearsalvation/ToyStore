public class Toy {
    private int weight = 0;
    private int id = 0;
    private String name = "";
    public Toy(int weight,int id,String name){
        this.weight = weight;
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        String str = "Идентификатор: " + Integer.toString(id) + " Название: " + name + " Вес: " + Integer.toString(weight);
        return str;
    }

}
