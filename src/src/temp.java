public class temp {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Manager emp2 = new Manager();
        emp1.name = "Sai";
        emp1.age = 19;
        emp1.ph = "8610750357";
        emp1.address = "Ambattur";
        emp1.sal = "50k";
        emp2.departemnt = "AIML";
        emp1.specialization = "Machine Learning";
        System.out.println(emp1.name + "\n" + emp1.age + "\n" + emp1.ph + "\n" + emp1.address + "\n" + emp1.specialization + "\n" + emp2.departemnt);
        emp1.dissal();
        System.out.println("\n");
        emp2.name = "Som";
        emp2.age = 19;
        emp2.ph = "8610750358";
        emp2.address = "Puducherry";
        emp2.sal = "50k";
        emp2.departemnt = "AI-DS";
        emp1.specialization = "Data Science";
        System.out.println(emp2.name + "\n" + emp2.age + "\n" + emp2.ph + "\n" + emp2.address + "\n" + emp1.specialization + "\n" + emp2.departemnt);
        emp2.dissal();

    }
}