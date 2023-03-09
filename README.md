My task:
Create a class according to your option from the list below
Using the lombok library, you should implement the set and get methods, constructors with arguments, the constructor by soaking and the overridden method toString()
The written class must contain a public static method getInstance(), and a field static field instance whose value will be returned by the method getInstance
In the class, you should also write the main method, in which you should create an array of class objects using:
- the default designer
- a constructor that receives all parameters
- 2 objects obtained when the getInstance method is called.

Output the identifiers of all objects from the array to the console using a loop with a prerequisite/

The laboratory task must be contained in the package ua.lviv.iot.algo.part1.lab1
The implementation of the task should be placed in the Github repository. For this, you should create a separate branch (branch), add your classes (commit, push) and create a Pull Request
Important: When creating a Github repository, you should select .gitignore for the Java language
After adding the code to the repository, you should make sure that only your implementation file (file with java extension) is in the repository
The lab file should be in the ua/lviv/iot/algo/part1/lab1 folder that matches the package name
The written code must meet the accepted requirements in the Java language (Java code conventions)

Variant 6
Create a Fridge class that will have the following fields:
brand: brand name of the refrigerator;
model: the name of the refrigerator model;
capacity: the volume of the refrigerating space in liters;
isDefrosting: status of automatic defrosting of the refrigerator (true - defrosting is enabled, false - disabled).
energyEfficiencyClass: refrigerator energy efficiency class (A, B, C, D, E, F, G);

The Fridge class must have the following public methods:
turnOnDefrosting(): method that turns on automatic defrosting of the refrigerator;
turnOffDefrosting(): the method that turns off the automatic defrosting of the refrigerator.
deleteModelInfo(): A method that sets the model name value to null.
