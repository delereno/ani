/* Based on the VUW ecs100 template
 *
 */
import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit; 
/** 
 * Write a description of class ghibli here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ghibli{
static final int DELAY = 41;
    /**
     * Constructor for objects of class ghibli 
     */
    public ghibli(){
    
    //UI.setWindowSize(1920, 1080);
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }


    /**
     * Main routine
     *
     */
    public static void main(String[] args) throws Exception{
        ghibli obj = new ghibli();
        String fname = null;
        int totalFrames = 9;
        int currentFrame = 0;
        
        //create a list of images
        ArrayList<String> frames = new ArrayList<String>(totalFrames);
        for (int i = 1; i <= 56; i++) {
            frames.add("scene" + i + ".png");
        }
        
        while(true) {
            
            if (currentFrame >= frames.size()) {
                currentFrame = 0;
            }
            UI.drawImage(frames.get(currentFrame), 0, 0, 960, 518);
            
            currentFrame++;
            TimeUnit.MILLISECONDS.sleep(DELAY);
        }
        
        //UI.drawImage(fname, 0, 0, 960, 518);
    }

}

