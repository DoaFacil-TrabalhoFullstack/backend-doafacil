package doafacil.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ErrorResponse {
    private String status;
    private int code;
    private String message;
    private Map<String, String[]> errors;

    public ErrorResponse(String status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.errors = new HashMap<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String[]> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String[]> errors) {
        this.errors = errors;
    }

    public void addError(String field, String[] messages) {
        this.errors.put(field, messages);
    }
}

