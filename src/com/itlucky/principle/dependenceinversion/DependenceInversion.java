package com.itlucky.principle.dependenceinversion;

/**
 * 依赖传递的几种实现方式
 */
public class DependenceInversion {
    public static void main(String[] args) {
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();

        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setItv(changHong);
        openAndClose.open();
    }
}

//1.通过接口传递实现依赖
//interface IOpenAndClose{
//    public void open(Itv itv);
//}
//
//interface Itv{
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose{
//
//    @Override
//    public void open(Itv itv) {
//        itv.play();
//    }
//}

class ChangHong implements Itv{

    @Override
    public void play() {
        System.out.println("打开长虹电视~");
    }
}

//2.通过构造器实现依赖传递
//interface Itv {
//    public void play();
//}
//
//interface IOpenAndClose{
//    public void open();
//}
//
//class OpenAndClose implements IOpenAndClose{
//
//    private Itv itv;
//
//    public OpenAndClose(Itv itv){
//        this.itv = itv;
//    }
//
//    @Override
//    public void open() {
//        itv.play();
//    }
//}
//3.通过setter实现依赖传递
interface Itv{
    public void play();
}

interface IOpenAndClose{
    public void open();
}

class OpenAndClose implements IOpenAndClose{

    private Itv itv;

    public void setItv(Itv itv){
        this.itv = itv;
    }

    @Override
    public void open() {
        itv.play();
    }
}