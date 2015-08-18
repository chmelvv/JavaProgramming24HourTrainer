package unit07;

public class TooManyBikesException extends Exception {
	private static final long serialVersionUID = 1380683294839721960L;

	TooManyBikesException (String msgText){
		super(msgText);
	}
}