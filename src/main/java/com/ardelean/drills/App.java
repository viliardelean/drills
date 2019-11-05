package com.ardelean.drills;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String ionatha = new String("ionatha");
        System.out.println( "Hello lsda World!" );
        StringDrills sds = new StringDrills();
        
        System.out.println(sds.replaceMiddleWithMinus("family"));
        System.out.println(sds.checkIfInmatriculation("ar28toee"));
    }
}
