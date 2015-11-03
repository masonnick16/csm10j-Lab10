/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unchecked;

/**
 *
 * @author Nick
 */
public class UncheckedExceptions {
    public static void ThrowIndexOutOfBounds(){
        int[] i= new int[10];
        System.out.println(i[10]);
    }
    public static void CatchIndexOutOfBounds(){
        try{
            int[] i= new int[10];
            System.out.println(i[10]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
        
    }
    public static void CatchIndexOutOfBoundsFinally(){
        try{
            int[] i= new int[10];
            System.out.println(i[9]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
        finally{
            System.out.println("Finally statement executed");
        }
    }
}
