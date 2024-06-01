public class ToString_Implementation {


    public static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


    public static void main(String[] args) {
//        Student st = new Student("Shekhar", 22);
        Student st = new Student("Shekhar", 23);
        System.out.println(st.toString());

    }
}
