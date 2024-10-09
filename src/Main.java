public class Main {

    public static void main(String[] args) {
      //Types for wrapping primitivie data types or autobox
//        Integer a =12;
//        Integer b = Integer.valueOf(12);
//        Integer c = new Integer(12);
//
//        //unboxing
//        int age = a;



        //Created and Called Generic class
//        GenericWrapper<Integer> a = new GenericWrapper<>(12);
//        GenericWrapper<String> b = new GenericWrapper<>("12");
//        System.out.println( a.getData());
//        System.out.println( b.getData());


        //Created and Called Generic method
        GenericMethod a = new GenericMethod();
        System.out.println(a.genericMEthod("12"));;


        //if we want to make the class specifically create of no or method of string in syntax of class or method use <E extends Number>
    }
}

//at the time of class declaration declare type
class GenericWrapper<Y>
{
    //create instance;
    Y y;

    //initialize through constructor
    GenericWrapper(Y y)
    {
        this.y =y;
    }

    //get through data types
    Y getData()
    {
        return y;
    }

}

//creating Generic Method without Generic Class

class GenericMethod
{
    <E extends String> E    genericMEthod(E e)
    {
        return e;
    }
}