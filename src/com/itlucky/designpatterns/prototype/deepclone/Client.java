package com.itlucky.designpatterns.prototype.deepclone;

/**
 * 深拷贝测试
 */
public class Client {

    public static void main(String[] args)
        throws CloneNotSupportedException {

        DeepProtoType dp = new DeepProtoType();
        dp.setId(111);
        dp.setName("深拷贝~");
        dp.setTarget(new DeepClonableTarget("code111","HF"));

        // 方式1：完成深拷贝
//        DeepProtoType dp1 = (DeepProtoType)dp.clone();
//        DeepProtoType dp2 = (DeepProtoType)dp.clone();
//        DeepProtoType dp3 = (DeepProtoType)dp.clone();
//        // 深拷贝的结果就是每一个拷贝后对象的属性虽然都一样，但是hashcode都不一样，说明不是相同的对象。
//        System.out.println("dp1: " + dp1 + "  dp1.hashcode = " + dp1.hashCode() + " dp1.getTarget().hashCode()" + dp1.getTarget().hashCode());
//        System.out.println("dp2: " + dp2 + "  dp2.hashcode = " + dp2.hashCode() + " dp2.getTarget().hashCode()" + dp2.getTarget().hashCode());
//        System.out.println("dp3: " + dp3 + "  dp3.hashcode = " + dp3.hashCode() + " dp3.getTarget().hashCode()" + dp3.getTarget().hashCode());

        //方式2：完成深拷贝
        DeepProtoType dp1 = (DeepProtoType)dp.deepClone();
        DeepProtoType dp2 = (DeepProtoType)dp.deepClone();
        DeepProtoType dp3 = (DeepProtoType)dp.deepClone();
        // 打印结果跟方式1 深拷贝是一样的。
        System.out.println("dp1: " + dp1 + "  dp1.hashcode = " + dp1.hashCode() + " dp1.getTarget().hashCode()" + dp1.getTarget().hashCode());
        System.out.println("dp2: " + dp2 + "  dp2.hashcode = " + dp2.hashCode() + " dp2.getTarget().hashCode()" + dp2.getTarget().hashCode());
        System.out.println("dp3: " + dp3 + "  dp3.hashcode = " + dp3.hashCode() + " dp3.getTarget().hashCode()" + dp3.getTarget().hashCode());

    }

}
