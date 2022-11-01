package com.itlucky.designpatterns.factory.jdk;

import java.util.Calendar;


/**
 * jDK中的工厂设计模式
 *
 * 查看Calendar源码可以知道，createCalendar方法返回的就是Calendar对象，那么使用的也是简单工厂模式
 *
 * 1-> getInstance
 * 2-> createCalendar
 * 3-> 简单工厂模式返回实例
 *
 *      if (aLocale.hasExtensions()) {
 *             String caltype = aLocale.getUnicodeLocaleType("ca");
 *             if (caltype != null) {
 *                 switch (caltype) {
 *                 case "buddhist":
 *                 cal = new BuddhistCalendar(zone, aLocale);
 *                     break;
 *                 case "japanese":
 *                     cal = new JapaneseImperialCalendar(zone, aLocale);
 *                     break;
 *                 case "gregory":
 *                     cal = new GregorianCalendar(zone, aLocale);
 *                     break;
 *                 }
 *             }
 *         }
 *
 *
 */
public class Factory_JDK {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("年：" + cal.get(Calendar.YEAR));
        // 月份下标从0开始，所以+1
        System.out.println("月：" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日：" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + cal.get(Calendar.MINUTE));
        System.out.println("秒：" + cal.get(Calendar.SECOND));

    }

}
