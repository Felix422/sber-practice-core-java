package task4;

public class Author {
    String name;
    String sex;
    String email;

    public Author(String name, String sex, String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setSex(String s){
        sex = s;
    }

    public String getSex(){
        return sex;
    }

    public void setEmail(String e){
        email = e;
    }

    public String getEmail(){
        return email;
    }
}
