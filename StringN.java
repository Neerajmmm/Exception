class StringN {
    public static void main(String args[])
    {
        String s1 = "pratap";//strings constant pool
        String s2 = "khade";
        String s3 = new String("pratap");//Heap area
        String s4 = new String("khade");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}