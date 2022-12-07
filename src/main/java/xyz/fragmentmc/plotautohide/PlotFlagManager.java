package xyz.fragmentmc.plotautohide;

import com.plotsquared.core.plot.Plot;
import com.plotsquared.core.plot.flag.GlobalFlagContainer;

public class PlotFlagManager {
    public static void addHideFlag(Plot plot, boolean value) {
        plot.setFlag(GlobalFlagContainer.getInstance().getFlagClassFromString("hide"), Boolean.toString(value));
    }
}
