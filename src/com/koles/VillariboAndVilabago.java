/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.koles;

import com.koles.instruments.MusicalInstruments;
import com.koles.keyboards.Organ;
import com.koles.keyboards.Piano;
import com.koles.strings.Guitar;
import com.koles.strings.Violin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class VillariboAndVilabago {

    /**
     * @param args the command line arguments
     */
    
    static List<MusicalInstruments> orchestra = new ArrayList<>();
    public static void main(String[] args) {
        createStringOrchestra();
        createKeyboardOrchestra();
        playOrchestra();
    }
    
    public static void createKeyboardOrchestra(){
        int len = 4;
        for(int i = 0; i < len; i++){
            if(i > 0){
                orchestra.add(new Piano());
            }else{
                orchestra.add(new Organ());
            }
        }
        
    }
    
    public static void createStringOrchestra(){
        Collections.addAll(orchestra, new Guitar(), new Violin(), new Violin());
    }
    
    public static void playOrchestra(){
        for(MusicalInstruments instrument : orchestra){
            instrument.play();
        }
    }
    
}
