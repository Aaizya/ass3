class MyTestingClass {    private int id;
    private String name;    // constructor, getters, setters
    public MyTestingClass() {        this.id = (int)(Math.random()*1000);
        this.name = "Test-" + id;    }
    // custom hashCode method    @Override
    public int hashCode() {        return id % 11;
    }}
class Student {
    private String name;    private int age;
    // constructor, getters, setters
    public Student() {
    this.name = "zhan";

    this.age = (int)(Math.random()*20 + 10);
}
}
