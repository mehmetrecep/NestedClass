public class ClassTester {
    public static void main(String[] args) {
        // NESTED CLASSES:
        // a class that's defined inside the body of another class.
        // Outer class(AKA enclosing): that's not nested, but maybe has
        // a nested class as a member.
        // Outer class can be public or package-private.


        // We have 4 type of nested classes:
        // 1. Static Nested Class.
        // 2. Non-static Nested Class(AKA inner class).
        // 3. Local Class(non-static nested class defined inside a method).
        // 4. Anonymous Class(local class without a name).
//        System.out.println(OuterClass.nameOfLab);
//        OuterClass o1 = new OuterClass();
//        System.out.println(o1.averageOfPassing);
        OuterClass out = new OuterClass();
        OuterClass.StaticNestedClass sn = new OuterClass.StaticNestedClass();
        System.out.println("-------");
        OuterClass.StaticNestedClass.InsideStaticNestedClass isn  = new OuterClass.StaticNestedClass.InsideStaticNestedClass();
        System.out.println("-------");
        OuterClass.StaticNestedClass.InsideNonStaticNestedClass nisn = sn.new InsideNonStaticNestedClass();
        System.out.println("-------");
        OuterClass.StaticNestedClass.InsideNonStaticNestedClass.InInside ininside =  nisn.new InInside();
        System.out.println("--------");
        OuterClass.InnerClass in = out.new InnerClass();
        System.out.println("-------");
        OuterClass.InnerClass.StaticClassInsideInnerClass stinin = new OuterClass.InnerClass.StaticClassInsideInnerClass();
        System.out.println("-------");
        OuterClass.InnerClass.NonStaticInsideInnerClass nonstin = in.new NonStaticInsideInnerClass();
        System.out.println("-------");
        nonstin.instanceMethod();
    }

}