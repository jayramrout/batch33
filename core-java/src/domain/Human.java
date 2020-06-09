package domain;

public class Human {
    // my name is <>

    private String name; // hiding the instance variable from outside world..encapsulation
    private int age;
    private float height;
    private String hairColor;
    private String ssn;

    /*public Human(){
        hairColor = "Black";
    }*/

    public Human(String ssn){
        this.ssn = ssn;
    }

    public Human(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }


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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
