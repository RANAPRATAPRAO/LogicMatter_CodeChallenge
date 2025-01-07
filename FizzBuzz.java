class FIzzBuzz{
public static void printFizzBuzz() {
for(int i=1; i<=100; i++) {
if(i%3==0 && i%5==0) System.out.println("FizzBuzz");
else if (i%5==0){
System.out.println("Buzz");
}
else if(i%3==0){
System.out.println("FIzz");
}
else{
System.out.println(i);
}
}
}
public static void main(String[] args) {
printFizzBuzz();
}
}