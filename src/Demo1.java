public class Demo1 {
    public static void main(String[] args) {
        class Demo12 extends  Thread{
            @Override
            public void run(){
                for (int i =0;i<=10;i++){
                    System.out.println(Thread.currentThread().getName());
                }
            }

        }
        Demo12 demo12 = new Demo12();
        demo12.setName("worker");
        demo12.start();

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
