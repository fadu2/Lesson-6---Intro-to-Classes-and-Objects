class Main {
  public static void main(String[] args) {
    // Intro to classes and objects 
    // Class - A class is a template that can be used to create objects. e.g. blueprint, cookie cutter, recipe 
    // Object - An object is an entity that has properties/attributes and behavior.  house, cookie, meal, student, etc 

    // Properties - known as instance variables e.g. name, age, gradeLevel 
    // Behavior - known as methods e.g. learns, runs, jumps, sings, plays, etc 

    Student joe = new Student("Joe Smith", 16, 11);

    System.out.println(joe.name);
    

  }
}