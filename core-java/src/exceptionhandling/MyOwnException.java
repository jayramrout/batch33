package exceptionhandling;

public class MyOwnException extends Exception {
    private String message;
    public MyOwnException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyOwnException{" +
                "message='" + message + '\'' +
                '}';
    }
}
