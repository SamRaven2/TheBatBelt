package com.bats.batbelt.utility;

/**
 * Created by Bats on 4/27/2015.
 */
public class CallerProvider extends SecurityManager
{
    public Class getCallerClass()
    {
        return getClassContext()[2];
    }
}
