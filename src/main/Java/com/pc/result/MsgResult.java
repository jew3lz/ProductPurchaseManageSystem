package com.pc.result;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * 报文返回
 * 
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class MsgResult<T> {

    /**
     * //必选，返回码,默认正常200
     */
    private int    code     = 200;

    /**
     * //可选，返回消息，网页端接口出现错误时使用此消息展示给用户， //手机端可忽略此消息，甚至服务端不传输此消息。
     */
    private String message  = "";

    /**
     * //必选，返回结果
     */
    private T      value;

    /**
     * //可选，当code=300 重定向时，使用此URL重新请求
     */
    private String redirect ;


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


    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }


    public String getRedirect() {
        return redirect;
    }


    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

}
