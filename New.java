public class New {
    public static void main(String[] args) throws ArithmeticException{
        int i=0;
        int j =5;
        try
        {
            int c=j/i;
            throw new ArithmeticException();

        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally{
        System.out.println("Inside Finally Block");
        }
    }
}
