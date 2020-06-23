package exceptionhandling;

public class DivisionByHundredException extends Exception {
    private String message;
    public DivisionByHundredException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyOwnException{" +
                "message='" + message + '\'' +
                '}';
    }
}
