package project;

public class Student {
    public String name;
    protected int id;
    private double mark;

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    public Student(){
        
    }
    public Student(String name){
        this.name = name;
    }
    public Student (String name, int id){
        this.name = name;
        this.id = id;
    }
}
