/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource.managment;

import java.lang.reflect.Array;

import java.util.Scanner;
/**
 *
 * @author looka
 */
public class project {
    Scanner si=new Scanner(System.in);
    Scanner arr=new Scanner(System.in);
    String name;
    public int id,s;

    struct a[]=new struct[s];
    public void input()
    {
        s=si.nextInt();
        for(int i=0;i<s;i++)
        {
            a[i].name=arr.next();
            a[i].id=arr.nextInt();
        }
    }
}
