package exceptions;

public class InvalidCommandException extends RuntimeException {
	private String myMessage;

    public InvalidCommandException(String msg)
    {
        this.myMessage = msg;
    }

    public void getMyMessage() {
        System.out.print(myMessage);
    }
}
