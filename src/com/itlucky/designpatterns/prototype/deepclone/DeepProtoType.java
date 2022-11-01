package com.itlucky.designpatterns.prototype.deepclone;

import java.io.*;


public class DeepProtoType implements Cloneable, Serializable {

    private int id;  // 基本类型

    private String name; // 基本类型

    private DeepClonableTarget target; // 引用类型

    public DeepProtoType(int id, String name, DeepClonableTarget target) {
        this.id = id;
        this.name = name;
        this.target = target;
    }

    public DeepProtoType() {
        super();
    }

    // ============深拷贝方式一：使用clone方法=============
    @Override
    protected Object clone()
        throws CloneNotSupportedException {

        Object deep = null;
        // 这里完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        //对引用类型的属性单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.target = (DeepClonableTarget)target.clone();  //调用引用类型的clone方法，如果引用类型还有引用类型成员变量，

        return deepProtoType;
    }
    // ============深拷贝方式一：使用clone方法=============

    //=============深拷贝方式二：通过对象的序列化实现 【推荐使用】============
    public Object deepClone(){
        // 为了序列化，创建输入输出流对象
        ByteArrayOutputStream bos = null; //字节数组输出流
        ObjectOutputStream oos = null;  // 对象输出流
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);  //将字节数组输出流放在对象输出流
            oos.writeObject(this);  // 当前对象【this】 以对象流的方式输出


            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();

            return copyObj;


        }catch (Exception e){
            e.printStackTrace();
            return null;
        } finally {
            // 关闭流
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            }catch (Exception e){
                System.out.println("关闭流失败，发生异常：" + e.getMessage());
            }

        }
    }
    //=============深拷贝方式二：通过对象的序列化实现 【推荐使用】============


    /**
     * 取得id的值
     *
     * @return id 的值
     */
    public int getId() {
        return id;
    }

    /**
     * 设定id的值
     *
     * @param id 设定值
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 取得name的值
     *
     * @return name 的值
     */
    public String getName() {
        return name;
    }

    /**
     * 设定name的值
     *
     * @param name 设定值
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 取得target的值
     *
     * @return target 的值
     */
    public DeepClonableTarget getTarget() {
        return target;
    }

    /**
     * 设定target的值
     *
     * @param target 设定值
     */
    public void setTarget(DeepClonableTarget target) {
        this.target = target;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DeepProtoType{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", target=").append(target);
        sb.append('}');
        return sb.toString();
    }
}
