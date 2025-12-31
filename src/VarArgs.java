public class VarArgs {
    public static void main(String[] args){
        //varargs = allow a method accept a varying # of arguments
        //no need for overloaded methods
        //java packs arguments into an array
        //...(ellipsis)
        System.out.println(avg(1,2, 3, 4, 5));

    }
    static double avg(double...numbers){
        double sum = 0;

        for(double number: numbers){
            sum+=number;
        }
        return sum / numbers.length;

    }

}
