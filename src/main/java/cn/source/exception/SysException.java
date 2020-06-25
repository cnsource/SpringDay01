package cn.source.exception;

public class SysException extends Exception{
    private String message;

    public SysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
