package eu.verdelhan.ocajexam.chapter4.ex4_2;

public class ObjectWithGettersAndSetters {

    private int answer = 0;
    private String foo = "bar";

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {

        ObjectWithGettersAndSetters object = new ObjectWithGettersAndSetters();
        System.out.println("This is an object with getters and setters: " + object);
        System.out.println("\tanswer: " + object.getAnswer());
        object.setAnswer(42);
        System.out.println("\tnew answer: " + object.getAnswer());
        System.out.println("\tfoo field: " + object.getFoo());
    }
}