package com.itlucky.designpatterns.prototype.deepclone;

import java.io.Serializable;


/**
 *  深拷贝，必须实现Cloneable和Serializable接口
 */
public class DeepClonableTarget implements Cloneable, Serializable {

    private String code ;

    private String address;

    public DeepClonableTarget(String code, String address) {
        this.code = code;
        this.address = address;
    }

    // 因为该类的属性都是string类型，可以采用基本clone()进行克隆。如果这里还有引用类型的成员变量，那么就要将引用类型的对象中再进行clone方法的重写。
    @Override
    protected Object clone()
        throws CloneNotSupportedException {

        return super.clone();
    }

    /**
     * 取得code的值
     *
     * @return code 的值
     */
    public String getCode() {
        return code;
    }

    /**
     * 设定code的值
     *
     * @param code 设定值
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 取得address的值
     *
     * @return address 的值
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设定address的值
     *
     * @param address 设定值
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DeepClonableTarget{");
        sb.append("code='").append(code).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
