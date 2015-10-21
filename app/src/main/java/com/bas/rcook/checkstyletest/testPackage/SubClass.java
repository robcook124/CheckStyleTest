package com.bas.rcook.checkstyletest.testPackage;

/**
 *  Checkstyle Example:
 *
 *  Uncomment line below to throw an error for the checkstyle task to find
 */
import android.app.ActionBar;

public class SubClass {

    public void doNothing()
    {
        /**
         *  FindBugs and PMD Example:
         *
         *  Uncomment code block to throw an error for the findbugs task to find
         *  Uncomment code block to throw an error for the pmd task to find
         */
        String aString = "bob";
        aString.replace('b', 'p');
        if(aString.equals("pop"));
    }

}
