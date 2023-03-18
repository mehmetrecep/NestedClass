public class OuterClass {
    // fields
    public static String nameOfLab = "Computer Programming";

    int averageOfPassing;

    public OuterClass(){
        averageOfPassing = 45;
        System.out.println("From OuterClass Constructor");
    }
    // Static Nested Class
    public static class StaticNestedClass{
        public StaticNestedClass(){
            System.out.println("Hello From Static Nested Class");
            System.out.println(nameOfLab);
        }
        public static class InsideStaticNestedClass{
            public InsideStaticNestedClass(){
                System.out.println("Hello From Inside Static Nested Class");
            }
        }
        public class InsideNonStaticNestedClass {
            public InsideNonStaticNestedClass(){
                System.out.println("Hello From Non Static Nested Class");
            }
            public class InInside{
                public InInside(){
                    System.out.println("Hello from In-Inside non static nested class");
                }
            }
        }
    }

    // 2. Non-static class (Inner Class)
    public class InnerClass{
        // Inner class is associated with an instance of enclosing class
        // Inner class can access static and non-static member of enclosing class
        int averageOfPassing;
        public InnerClass(){
            averageOfPassing = 60;
            System.out.println("Hello from inner class");
            System.out.println(nameOfLab);
            System.out.println("InnerClass: "+averageOfPassing);
            System.out.println("Outer class averageOfPassing "+OuterClass.this.averageOfPassing);
        }
        public static class StaticClassInsideInnerClass{
            public StaticClassInsideInnerClass(){
                System.out.println("Hello from StaticClassInsideInnerClass ");
            }
        }
        public class NonStaticInsideInnerClass{
            public NonStaticInsideInnerClass(){
                System.out.println("Hello from NonStaticInsideInnerClass ");
            }
            public static void instanceMethod(){
                class LocalClass{
                    public LocalClass(){
                        System.out.println("Welcome from LocalClass");
                    }

                }
                LocalClass local = new LocalClass();

                Object myAnonymousObject = new Object() {

                    @Override
                    public java.lang.String toString() {
                        return "Hello from Anonymous Class";
                    }
                };
                System.out.println(myAnonymousObject);

            }
        }
    }
}
