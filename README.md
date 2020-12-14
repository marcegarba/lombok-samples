# Lombok Examples

* These sample classes and unit tests demonstrate how Lombok can help
  avoid writing boilerplate code in Java
* The examples show a simple data, or value class, in its many incarnations
* There are 8 varsions of this sample class, `User`
* The first 5 don't use Lombok, and improve the quality, although this involves
  adding more code to what should be a _very simple class_
* Versions 6, 7 and 8 do use Lombok, and show ways in which adding Lombok to
  a Java project helps reducing significantly the line count, and at the same
  time improve the quality

## Links

* [Lombok Project](https://projectlombok.org/)
* [Lombok Stable Features](https://projectlombok.org/features/all)

## Code examples

Each version of the `User` class has a corresponding unit test class.

Objects of these classes, represent the data present
in a _user_:

* ID           _an int, which identifies the user_
* First Name
* Second Name
* Last Name

## Versions

### v1

* This is the ugliest Java code; just an example of what **not to do**
* Public member
* No constructor
* No override of `toString()`, `equals()`, `hashCode()`
* Most unit tests are ignored

### v2

* Adds a constructor
* Members are now private
* Getters and setters
* No overrides for `toString()`, `equals()`, `hashCode()`
* Most unit tests are ignored

### v3

* Removed setters, as this is supposedly a Data Class which should be
  free to share between threads, and the contents should **not be**
  modified.
* Added overrides for `toString()`, `equals()`, `hashCode()`
* Unit tests are all enabled

### v4

* Using `final` for members and constructor arguments; makes code more
  reliable, against negligent reassignment

### v5

* A small, but important, difference

### v6

* First Lombok usage, [@Data](https://projectlombok.org/features/Data), featuring:
  * Removed unneded code, which Lombok adds at compile time
  * IDEs with a proper plugin, can show the automatically added
    methods
* Configuration file which tells Jacoco not to include coverage data
  on generated code

### v7

* Replacing `@Data` with [@Value](https://projectlombok.org/features/Value)
  which makes immutable classes
  * All members are final
  * Class is final as well, since immutability cannot be forced on subclasses

### v8

* Using the [@Builder](https://projectlombok.org/features/Builder) annotation,
  to generate a subclass which aids in building new objects based on another one
* Added a test to show the builder working

## Other Notes

* The project is built with Gradle, and it uses JUnit and Jacoco, for unit tests and test coverage,
  correspondingly
* The file `lombok.config` at the root has an indication so that Jacocoo does not compute coverage
  code from built code
