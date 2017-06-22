package com.example;

public class Test {
    public volatile int inc = 0x123546;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
//        final Test test = new Test();
//        for (int i = 0; i < 2; i++) {
//            new Thread() {
//                public void run() {
//                    for (int j = 0; j < 1000; j++)
//                        test.increase();
//                }
//            }.start();
//        }
        //保证前面的线程都执行完
//        while (Thread.activeCount() > 1) {
//            Thread.yield();
//        }
//        HashMap<Long, Demo> map = new HashMap<>();

//        List<Demo> demos = new ArrayList<>();

//        Demo demo1 = new Demo();
//        demo1.itemId = 111;
//        demo1.name = "111";
//
//        map.put(1111L, demo1);

//        demos.add(demo1);

//        Demo demo2 = new Demo();
//        demo2.itemId = 111;
//        demo2.name = "222";

//        if (map.containsKey(1111L)) {
//            map.remove(1111L);
//            map.put(1111L, demo2);
//        }
//        map.put(1111L, demo2);


//        if (demos.contains(demo2)) {
//            demos.add(demo2);
//        }

//        System.out.println(map.size());


        Demo demo = (Demo) getResult(0);

        System.out.println("");

        if (!(null instanceof Demo)) {
            System.out.println("111");
        }

    }

    public static Object getResult(int number) {
        if (number == 0) {
            return new Demo();
        } else if (number == 1) {
            return "Hello";
        } else {
            return null;
        }
    }

    private static class Demo {

        public long itemId;
        public String name;

        public Demo() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Demo demo = (Demo) o;

            if (itemId != demo.itemId) return false;

            return true;
        }
    }

}
