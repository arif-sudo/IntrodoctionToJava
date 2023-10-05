package OOP05_10;

// A java package is a group of similar types of classes, interfaces and sub-packages.
// Package in java can be categorized in two form, built-in package and user-defined package.
//  There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

// Advantage of Java Package
//  1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.
//  2) Java package provides access protection.
//  3) Java package removes naming collision.

// There are three ways to access the package from outside the package.
//  import package.*;
//  import package.classname;
//  fully qualified name.

// 1) Using packagename.*
//If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.
//The import keyword is used to make the classes and interface of another package accessible to the current package.

// 2) Using packagename.classname
// If you import package.classname then only declared class of this package will be accessible.

// 3) Using fully qualified name
// If you use fully qualified name then only declared class of this package will be accessible.
// Now there is no need to import. But you need to use fully qualified name every time when you are accessing the class or interface.
// It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class.
// f.e. pack.A obj = new pack.A()

public class Package {
    public static void main(String[] args) {

    }
}
// ** Note: If you import a package, subpackages will not be imported.

// Subpackage in java
//Package inside the package is called the subpackage. It should be created to categorize the package further.

// *** Rule: There can be only one public class in a java source file, and it must be saved by the public class name.
