//garbage collection:in java app if we want to destroy an object explicitly  then we have to use following steps:
//1.nullify the respective reference variable
//A a=new A();
//a==null;
//note: if we nullify the object reference then only the respective object is eligible for garbage collection
//02.activate garbage collector and destroy nullified object. one can use System.gc() method
//System.gc() method destroy but before destroying the object jvm will access finalize () method on the object which is
// going to be destroyed.
class A{
 A()
 {
  System.out.println("object creat");
 }
 @Override
 protected void finalize() throws Throwable{
  System.out.println("object destroyed");
 }
}

class GarbageCollection {
 public static void main(String[] args) {
  A a=new A();
  a=null;
  System.gc();
 }
}
