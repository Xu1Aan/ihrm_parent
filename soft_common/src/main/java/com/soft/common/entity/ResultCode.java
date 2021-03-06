package com.soft.common.entity;

/**
 * 公共的返回码
 *    返回码code：
 *      成功：10000
 *      失败：10001
 *      未登录：10002
 *      未授权：10003
 *      抛出异常：99999
 */
public enum ResultCode {

    SUCCESS(true,10000,"操作成功！"),
    //---系统错误返回码-----
    FAIL(false,10001,"操作失败"),
    UNAUTHENTICATED(false,10002,"您还未登录"),
    UNAUTHORISE(false,10003,"权限不足"),
    SERVER_ERROR(false,99999,"抱歉，系统繁忙，请稍后重试！"),
    FAILSELECT(false,10004,"选择失败,该考试已选择"),
    FAILTEST(false,10005,"你还未选课"),
    FAILCANCEL(false,10006,"退选失败,该考试无法退选"),
    FAILSELECTBYADMIN(false,10007,"该文件格式不符合!"),
    FAILSELECTBYADMIN1(false,10007,"未找到该文件指定的教师"),
    FAILSELECTBYADMIN2(false,10007,"当前考试考场已分配完！请增加考场"),
    FAILEXCCHANGETEST(false,10008,"该老师已选择该考试"),
    //---用户操作返回码  2xxxx----
    MOBILEORPASSWORDERROR(false,20001,"用户名或密码错误");

    //---企业操作返回码  3xxxx----
    //---权限操作返回码----
    //---其他操作返回码----

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    ResultCode(boolean success,int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}
