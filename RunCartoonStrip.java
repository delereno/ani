// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a 13DTC assignment.
// You may not distribute it in any other way without permission.

/* Code for 13DTC
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;

/** RunCartoonStrip   */
public class RunCartoonStrip{
    public static void main(String[] arguments){
        CartoonStrip cs = new CartoonStrip();
        UI.addButton("Clear", UI::clearGraphics );
        UI.addButton("Tell Story", cs::tellStory );
        UI.addButton("Three dancers", cs::threeDancers );
        UI.addButton("Quit", UI::quit );
        UI.setDivider(0);       // Expand the graphics area
    }

}
