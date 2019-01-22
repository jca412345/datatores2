package secondchapter;

public class Run {
    public static void main(String[] args) {
        //2-8class
        Twoeight twoeight=new Twoeight();

        //2-15class
        Twofifteen twofifteen=new Twofifteen();
        int[] test=twofifteen.create(20000000);
        //2-20class
        Twotwenty twotwenty=new Twotwenty();

        //2-26
        Twotwentysix twotwentysix=new Twotwentysix();
        int[] a={3,3,4,2,3,3,4,3,3};
        int[] b={3,3,4,2,4,4,2,4};

        //2-28
        TwoTwentyeight twoTwentyeight=new TwoTwentyeight();
        int[] c={1,3,4,10,11,4,7,12,19,1,2,3};


        long startTime=System.currentTimeMillis();
        //2-8
        //twoeight.generate1(100);//时间3
        //twoeight.generate1(10000);//时间112
        //twoeight.generate1(100000);//时间10020
//        twoeight.generate2(100);//时间1
//        twoeight.generate2(10000);//50
//        twoeight.generate2(100000);//362

//        twofifteen.output1(test);//10
//            twofifteen.output2(test);//0

        //twotwenty.prime1(97);

        //twotwentysix.mainelement(a);

        twoTwentyeight.aiaddaj(c);
        long endTime=System.currentTimeMillis();

        System.out.println("运行总时间"+(endTime-startTime));
    }
}
