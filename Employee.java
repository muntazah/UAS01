/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengganti lisensi
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java untuk mengedit template ini
 */
package uas_soal_no2;

/**
 *
 * @author ASUS
 */
    public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Employee is working.");
    }
}

// Manager class
class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Manager is managing tasks.");
    }
}

// Developer class
class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Developer is coding.");
    }
}

// Designer class
class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Designer is designing.");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Create instances of Manager, Developer, and Designer
        System.out.println("===== Manager =====");
        Manager manager = new Manager("Sri Hastuti");
        System.out.println("Manager Name: " + manager.getName());
        manager.work(); // Memanggil metode work pada manager
        
        System.out.println();
        
        System.out.println("===== Developer =====");
        Developer developer = new Developer("Nurisa");
        System.out.println("Developer Name: " + developer.getName());
        developer.work(); // Memanggil metode work pada developer
        
        System.out.println();
        
        System.out.println("===== Designer =====");
        Designer designer = new Designer("Tuti");
        System.out.println("Designer Name: " + designer.getName());
        designer.work();
    }
}