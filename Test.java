public class Test {
    public static void main(String[] args)  {
        Computer c=new  Computer("Lenovo","B","Windows",2010);
        XMLService.serialize(c);
        Computer d;
        d=XMLService.deseriaize();
        System.out.println(d);
    }
}