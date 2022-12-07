package xyz.fragmentmc.plotautohide;

import com.google.common.eventbus.Subscribe;
import com.plotsquared.core.PlotAPI;
import com.plotsquared.core.events.PlotClaimedNotifyEvent;
import com.plotsquared.core.events.PlotClearEvent;

public class P2Listener {
    public P2Listener(PlotAPI api) {
        api.registerListener(this);
    }

    @Subscribe
    public void onPlotClaimedNotify(PlotClaimedNotifyEvent e) {
        PlotFlagManager.addHideFlag(e.getPlot(), true);
    }

    @Subscribe
    public void onPlotClear(PlotClearEvent e) {
        PlotFlagManager.addHideFlag(e.getPlot(), true);
    }
}
