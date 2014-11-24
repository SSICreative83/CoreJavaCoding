/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

/**
 *
 * @author huijun
 */
public class InnerClassTest {
	private int a;	//defaults to 0

	public void testA(){
		System.out.println("from ClassA");
		ClassAChild classAChild = new ClassAChild();
		int b = classAChild.childA;	//can access inner class's private field
                System.out.println(b);
	}

	public void testB(){
                final int aa = 1;
		class ClassAChildChild {	//local inner class, in a method, can only accessed in the method.
			//private int aa = 1;
			public void test(){
				System.out.println("from ClassAChildChild");
				System.out.println(aa);
			}
		}
                
                ClassAChildChild cc = new ClassAChildChild();
                cc.test();
	}

	static public class ClassAChild {	//class A's inner class, default to current package
		private int childA = 10;
		int a = 1;
		public void testA(){
			int a = 10;
			System.out.println("from ClassAChild");
			int b = a + 1;	//can access outer class's fields, but access own method, then class field first
			System.out.println(b);
		}
	}    
        
        public static void main(String[] args) {
            InnerClassTest classA = new InnerClassTest();
            classA.testA();
            
            //InnerClassTest.ClassAChild classAChild = classA.new ClassAChild();
            InnerClassTest.ClassAChild classAChild = new InnerClassTest.ClassAChild();
            
            classAChild.testA();
            
            classA.testB(); //will print "from ClassAChildChild"
        }
}
