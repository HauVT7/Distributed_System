/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.distributed_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class Bai3 {
    
   public static void Readchar() throws IOException{
       
       BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
       char c;
       System.out.println("Moi ban nhap vao mot so ki tu : ");
       do{
         c = (char)br.read();
         System.out.println("Ki tu ban vua nhap la : "+ c);
         }while(c != '.') ;
    
        }
   }
