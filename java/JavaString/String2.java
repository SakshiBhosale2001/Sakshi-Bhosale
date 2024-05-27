package JavaString;
class String2 {
    public static void main(String[] args)
        {
            String s="q";
            String s7="Q";
            String s1="s";
            StringBuilder s8=new StringBuilder("s");
            String s2=new String("s");
            String s3=new String("s");
            System.out.println("StringBuffer : "+s8.hashCode());
            System.out.println("S "+s+" "+s.hashCode());
            System.out.println("S "+s1+" "+s1.hashCode());
            System.out.println("S2 "+s2+" "+s2.hashCode());
            System.out.println("Concatination "+s+" "+s1);
            System.out.println("S3 "+s3+" "+s3.hashCode());
            String s4="s";
            System.out.println();


            //Whole comparTo method returns the value on the basis of unicode value of 1st letter of strings
            //s>s1=returns +ve value     //here string are not compared on the basis of length but on the first character like a<b<c...z
            //s==s1 returns 0
            //s<s1 returns -ve value
            System.out.println(s.compareTo(s1));
            System.out.println("s compare to s4 "+s.compareTo(s4));             //o/p of it is unicode of string value in s - unicode of string value in s4
            String s5="Sakhi N Bhosale";
            System.out.println(s5.substring(3,7));
            String s6=s5.substring(3,7);
            System.out.println(s6);
            System.out.println(s5.contains("B"));       //returns boolean values if contains true if not false

            //another method to concatinate
            //use join method
            System.out.println(s.equals(s1));
            System.out.println(s.isEmpty());
            System.out.println(s.concat(s1));
            System.out.println(s.replace('q','p'));     //temporary change
            System.out.println(s);
            System.out.println(s5.replace('a','A'));        //It replaces all occurrences of the specified CharSequence.    //temporary
            System.out.println(s5);
            System.out.println(s.compareToIgnoreCase(s7));  //ignore casesentivenesss
            System.out.println(s.intern());
            s5.concat("So");
            System.out.println(s5);         //immutable...once created can't be modified
        }
}

