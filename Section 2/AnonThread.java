/**
 * @Description 实现匿名类（示例A）
 * @Author Gao Hang Hang
 * @Date 2019-06-29 01:14
 **/
public class AnonThread {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                // 来自匿名线程的Hello
                System.out.println("Hello from inside the anonymous thread");
            }
        };
        thread.start();
    }
}
