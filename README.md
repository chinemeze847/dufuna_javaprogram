# Dufuna Java Programming Crash Course
A program that consist of several tasks on the path of becoming Java experts for the purpose of an internship

##Description
###Address Package
which contains one class that prints Hello World

###Lekki Package 
This package contains three packages which are
the model, repository , service and also a main class which is a MockLekkiPropertyApp

####Model package
This package contains the LekkiProperty which represents and entity with attributes and
methods

####Repository package
It contains an interface(SimpleLekkiPropertyRepository) and 
its implementation(SimpleLekkiPropertyRepositoryImpl) which are 
used to save the data in a HashMap

####Service package
It contains our service interface and its implimentation which interact
with our repository directly to establish contracts

###Tax Package
It contains our services and classes to calculate the tax to be paid by an 
individual given an income say I.

###Test Package
This package test our repositories and service implementation to make sure they
return what should be returned and if yes the test passes else they fail.

##Technologies
#####Junit 
which is used for testing my classes

#####JDk 17
which is the recommended JDK version with Long Term support

##Dependencies
Junit
Apache commons for my hashing

##How To Use
within the MockLekkiPropertyApp you can instantiate a lekki property or many
of them like this
````
LekkiProperty property = new LekkiProperty(1,"lagos","FLAT");
````
Then you can save this property by calling 
````
service.saveProperty(property);
````
This will save it to our HashMap.
Then you query the repository using the service class like this
````
System.out.println(service.getProperty(1))
````
This will return the property saved with Id of 1 and print it to the console.

We can get all the properties by using
````
System.out.println(service.getAllProperties());
````