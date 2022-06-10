package tests;


    // abstract class
    abstract class ModifiersEx {
        public String fname = "John";
        public int age = 24;
        public abstract void study(); // abstract method
    }

    // Subclass (inherit from Main)
    class Student extends ModifiersEx {
        public int graduationYear = 2018;
        public void study() { // the body of the abstract method is provided here
            System.out.println("Studying all day long");
        }
    }


