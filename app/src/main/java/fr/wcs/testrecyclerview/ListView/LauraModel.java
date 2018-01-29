package fr.wcs.testrecyclerview.ListView;

/**
 * Created by apprenti on 11/30/17.
 */

public class LauraModel {

    String name;
    String adress;
    String age;

    public LauraModel(String name, String adress, String age) {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
