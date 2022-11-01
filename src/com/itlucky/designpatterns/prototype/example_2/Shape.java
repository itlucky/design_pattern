package com.itlucky.designpatterns.prototype.example_2;

public abstract class Shape implements Cloneable{

    private String id;

    protected String type;

    abstract void draw();

    @Override
    protected Object clone()
        throws CloneNotSupportedException {

        Object shape = null;

        try {
            shape = super.clone();
        }catch (Exception e){
            System.out.println("克隆失败，发生异常~");
            e.printStackTrace();
        }
        return shape;
    }

    /**
     * 取得id的值
     *
     * @return id 的值
     */
    public String getId() {
        return id;
    }

    /**
     * 设定id的值
     *
     * @param id 设定值
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 取得type的值
     *
     * @return type 的值
     */
    public String getType() {
        return type;
    }

    /**
     * 设定type的值
     *
     * @param type 设定值
     */
    public void setType(String type) {
        this.type = type;
    }
}
