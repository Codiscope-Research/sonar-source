class Foo {
  void foo() {
    "foo".equals("bar");        // Noncompliant {{Move the "bar" string literal on the left side of this string comparison.}}
    foo.equals("qux");          // Noncompliant {{Move the "qux" string literal on the left side of this string comparison.}}
    "foo".equals(bar);          
    "foo".foo("bar");           
    "foo".equals();             
    foo.equals("bar".length()); 
    "foo".equals[0];            
    int a = foo.equals;         
    "foo".equalsIgnoreCase(""); // Noncompliant {{Move the "" string literal on the left side of this string comparison.}}
    StringUtils.equals("", ""); 

    foo()
    .bar().
    equals
    ("");                       // Noncompliant
  }
}
