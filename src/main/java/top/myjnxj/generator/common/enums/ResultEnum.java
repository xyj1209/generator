package top.myjnxj.generator.common.enums;

/**
 * 返回数据
 */
public enum ResultEnum {
    UN_ERROR(-1, "未知错误"),
    SUCCESS(1, "成功"),
    DATABASE_ERROR(100001, "数据库参数错误");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
