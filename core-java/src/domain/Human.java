package domain;

// Gadget
//    battery...

//Iphone extends Gadge
//    touchscreen

// Drone extends Gadget
    // fly

public class Human {
    // my name is <>

    private String name; // hiding the instance variable from outside world..encapsulation
    private int age;
    private float height;
    private String hairColor;
    private String ssn;
    private String favoriteSports;

    public String getFavoriteSports() {
        return favoriteSports;
    }

    public void setFavoriteSports(String favoriteSports) {
        this.favoriteSports = favoriteSports;
    }


    /*public Human(){
        hairColor = "Black";
    }*/

    public Human(String ssn){
        this.ssn = ssn;
        System.out.println("Human "+ ssn +" Created");
    }

    public Human(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

    public Human(String name, String ssn, int age){
        this(name,ssn);
        this.age = age;
    }

    public Human(String name, String ssn, int age, int height){
        this(name,ssn,age);
        this.height = height;
    }

    /* You can add a constructor or function by just changing the sequence...
    public Human(String name, int age, String ssn){
        this.name = name;
        this.ssn = ssn;
        this.age = age;
    }*/

    // name convention..
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    /*public void setAge(int ageX) {
        age = ageX;
    }*/

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float heightX) {
        if(heightX < 2 ){
            height = 2.5f;
        }else {
            height = heightX;
        }
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColorX) {
        hairColor = hairColorX;
    }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", ssn=" + this.ssn +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I am been destroyed "+ ssn);
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
