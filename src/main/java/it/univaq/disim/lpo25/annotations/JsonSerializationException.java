package it.univaq.disim.lpo25.annotations;
public class JsonSerializationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JsonSerializationException(String message) {
        super(message);
    }
}