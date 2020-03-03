package Lab4;

class Gen<X,Y>{
    String ob1;
    String ob2;
    Integer inob1;
    Integer inob2;

    <X extends String, Y extends String>Gen(X ob1,Y ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    <X extends Integer, Y extends Integer>Gen(X ob1, Y ob2){
        inob1 = ob1;
        inob2 = ob2;
    }

    <X extends String, Y extends Integer>Gen(X ob1, Y ob2){
        this.ob1 = ob1;
        inob2 = ob2;
    }

    <X extends Integer, Y extends String>Gen(X ob1, Y ob2){
        inob1 = ob1;
        this.ob2 = ob2;
    }


    public void WhatIs() {
       if (ob1 != null && ob2 != null)
           System.out.println("Kolichestvo bukv a: " + countA());
       if (ob1 != null && inob2 != null || ob2 != null && inob1 != null)
           repeatString();
       if(inob1 != null && inob2 != null)
           System.out.println("Value: " + multiplyInt());
    }

    int countA(){
        int count = 0;
        char[] c1 = ob1.toCharArray();
        for(char t:c1){
            if(t == 'a' || t == 'A')
                count ++;
        }
        char[] c2 = ob2.toCharArray();
        for(char t:c2){
            if(t == 'a' || t == 'A')
                count ++;
        }
        return count;
    }

   private void repeatString(){
        if(ob1 != null){
            for(int i = 0; i < inob2; i++)
                System.out.println(ob1);
        }
        else{
            for(int i = 0; i < inob1; i++)
                System.out.println(ob2);
        }
    }

    private int multiplyInt(){
        return inob1 * inob2;
    }
}

public class Generics {
    public static void main(String[] args) {
        String s1 = "Avesfha";
        String s2 = "Saehafkj";
        int a = 1;
        int b = 5;
        Gen<String, String> g1 = new Gen<String, String>(s1,s2);
        Gen<Integer, Integer> g2 = new Gen<Integer,Integer>(a,b);
        Gen<Integer, String> g3 = new Gen<Integer,String>(b,s1);
        g1.WhatIs();
        g2.WhatIs();
        g3.WhatIs();
    }
}
