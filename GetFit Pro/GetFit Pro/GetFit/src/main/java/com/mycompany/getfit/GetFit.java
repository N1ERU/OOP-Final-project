/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.getfit;

import com.mycompany.getfit.classlist.Breakfast;
import com.mycompany.getfit.classlist.Client;
import com.mycompany.getfit.classlist.Dinner;
import com.mycompany.getfit.classlist.Lunch;
import com.mycompany.getfit.classlist.Nutrionist;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eric_
 */
public class GetFit {
    static gui jgui = new gui();
    
    static ArrayList<Breakfast> BreakfastList = new ArrayList<>();
    static ArrayList<Lunch> LunchList = new ArrayList<>();
    static ArrayList<Dinner> DinnerList = new ArrayList<>();
    static ArrayList<Client> ClientList = new ArrayList<>();
    static ArrayList<Nutrionist> NutrionistList = new ArrayList<>();
    
    public static void main(String[] args) {
        // Starting
        open();
        splash();
        onboarding();
        
        // <test>
//        File file = new File("C:\\Users\\eric_\\Desktop\\Documents\\1Materi CS\\Semester 3\\OOP\\1Project\\GetFit Pro\\GetFit\\src\\main\\java\\com\\mycompany\\getfit\\cutting_plan.txt");
//        try{
//            Scanner scan = new Scanner(file);
//            while(scan.hasNextLine()){
//                System.out.print(scan.nextLine() + "\n");
//            }
//        } catch (Exception e){}
        
    }
    
    public static void open(){
        // Show Frame
        jgui.setVisible(true);
        jgui.Splash.setVisible(false);
        jgui.Onboarding.setVisible(false);
        jgui.Login_Background.setVisible((false));
        jgui.MainScreen.setVisible(false);
    }
    
    public static void splash(){
        // Show Splash Screen
        jgui.Splash.setVisible(true);
        try{
            for(int x=0; x<=100; x++){
                Thread.sleep(30);
                jgui.Splash_ProgressBar.setValue(x);
            }
            Thread.sleep(500);
        } catch (Exception e){}
        
        // Hide Splash Screen
        jgui.Splash.setVisible(false);
    }
    
    public static void onboarding(){
        // Show Onboarding
        jgui.Onboarding.setVisible(true);
        jgui.Onboard_Info1.setVisible(false);
        jgui.Onboard_Info1.setVisible(false);
        jgui.Onboard_Info1.setVisible(false);
        jgui.Onboard_BtnNext.setVisible(false);
        
        // Show Info
        try{
            // Info 1
            jgui.Onboard_Info1.setVisible(true);
            Thread.sleep(3000);
            // Info 2
            jgui.Onboard_Info1.setVisible(false);
            jgui.Onboard_Info2.setVisible(true);
            Thread.sleep(3000);
            // Info 3 & Button
            jgui.Onboard_Info2.setVisible(false);
            jgui.Onboard_Info3.setVisible(true);
            jgui.Onboard_BtnNext.setVisible(true);
        } catch(Exception e){}
        
    }
}
