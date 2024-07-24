
package org.example;

public class ErrorCode {

    private String message;
    private String code;
    private String desc;

    public ErrorCode(String massage, String code, String desc) {
        this.message = massage;
        this.code = code;
        this.desc = desc;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public void setMessage(String massage) {
        this.message = massage;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ErrorCode{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
