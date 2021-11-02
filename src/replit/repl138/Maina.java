package replit.repl138;
/*For you to do:
In AnotherClass declare a private, default, protected, public methods
 and have them each return the name of what access modifier they are using.
All methods should be accessible by class name
Call methods of Another class inside Main class
**Expected Output:**
default
protected
public*/
class AnotherClassa {

    private String method1() {
        final String aPrivat = "Privat";
        return aPrivat;
    }

    String method2() {
        final String aDefault = "Default";
        return aDefault;
    }

    protected String method3() {
        final String aProtected = "Protected";
        return aProtected;
    }

    public String method4() {
        final String aPublic = "Public";
        return aPublic;
    }
}

class Maina {
    public static void main(String[] args) {
        AnotherClassa obj1=new AnotherClassa();
        System.out.println(obj1.method2());
        System.out.println(obj1.method3());
        System.out.println(obj1.method4());
    }
}
