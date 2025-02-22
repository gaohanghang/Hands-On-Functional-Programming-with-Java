package 成员内部类;

/**
 * 成员内部类也是最普通的内部类，它是外围类的一个成员，所以他是可以无限制的访问外围类的所有 成员属性和方法，尽管是private的，但是外围类要访问内部类的成员属性和方法则需要通过内部类实例来访问。
 *
 * 在成员内部类中要注意两点，
 * 第一：成员内部类中不能存在任何static的变量和方法；
 * 第二：成员内部类是依附于外围类的，所以只有先创建了外围类才能够创建内部类。
 *
 * 推荐使用getxxx()来获取成员内部类，尤其是该内部类的构造函数无参数时 。
 *
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-06-28 19:42
 **/
public class OuterClass {
    private String str;

    public void outerDisplay(){
        System.out.println("outerClass...");
    }

    private class InnerClass{
        public void innerDisplay(){
            //使用外围内的属性
            str = "chenssy...";
            System.out.println(str);
            //使用外围内的方法
            outerDisplay();
        }
    }

    /*推荐使用getxxx()来获取成员内部类，尤其是该内部类的构造函数无参数时 */
    public InnerClass getInnerClass(){
        return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.getInnerClass();
        inner.innerDisplay();
    }
}
