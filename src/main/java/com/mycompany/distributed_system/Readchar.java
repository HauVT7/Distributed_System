/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.distributed_system;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Readchar {
    public static void readbyte() throws IOException   {
        byte data[] = new byte[100];
        System.out.println("Moi ban nhap vao mot so ki tu : ");
        System.in.read(data);
        System.out.println("Cac ki tu cua ban vua nhap la : ");
        for(int i = 0; i< data.length;i++){
            System.out.println((char)(data[i]));
        
        
    }
    
}
}
