package citiCollege.June;

public class HelloWorldBean {

    public String message;

    public String getMessage() {
        return message;
    }

    public HelloWorldBean(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
