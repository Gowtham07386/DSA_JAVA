package access_modifiers;

import access_modifiers.others.*;
import access_modifiers.others.tools.*;

public class demo {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        Calc c = new Calc();
        AdvCalc ac = new AdvCalc();

        obj.msg();
        obj1.show();
        System.out.println(ac.add(5, 3));
        System.out.println(ac.mul(4, 2));
    }
}
