package pattern.singleton.lazy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeTest {
    public static void main(String[] args) {
        /*int count = 1000;
        CountDownLatch latch = new CountDownLatch(count);
        Long start = System.currentTimeMillis();
        for(int i=0 ;i<count ; i++){
            new Thread(){
                public void run(){
                    try{
                        latch.await();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    Object obj = LazyOne.getSingleton();
                    //Object obj = LazyTwo.getLazyTwo();
                    System.out.println(System.currentTimeMillis()+":"+obj);
                }
            }.start(); //每循环一次就启动一个线程，

            latch.countDown();
        }

        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end - start));*/

        // 锁住所有线程，等待并发执行
        final CountDownLatch begin = new CountDownLatch(1);


        final ExecutorService exec = Executors.newFixedThreadPool(200);
        Long start = System.currentTimeMillis();
        for (int index = 0; index < 10; index++)
        {

            Runnable run = new Runnable()
            {
                public void run() {
                    try {
                        // 等待，所有一起执行
                        begin.await();
                        //开始模拟登录等待。。。
                        //Thread.sleep((long) (Math.random() * 1000));
                        //Object obj = LazyOne.getSingleton();
                        //Object obj = LazyTwo.getLazyTwo();
                        Object obj = LazyThree.getLazyThree();
                        System.out.println(obj);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    finally {
                    }
                }
            };
            exec.submit(run);
        }

        System.out.println("开始执行");
        // begin减一，开始并发执行
        begin.countDown();

        //关闭执行
        exec.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end - start));
    }


}

