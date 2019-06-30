/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-06-30 00:11
 **/
public class LambdaThread {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Hello from lambda thread");
        }).start();
    }
}
