package fi.dy.masa.malilib;

import fi.dy.masa.malilib.config.gui.GuiModConfigs;
import fi.dy.masa.malilib.config.gui.liteloader.ConfigPanelBase;

public class MaLiLibConfigPanel extends ConfigPanelBase
{
    @Override
    protected String getPanelTitlePrefix()
    {
        return MaLiLibReference.MOD_NAME;
    }

    @Override
    protected void createSubPanels()
    {
        this.addSubPanel((new GuiModConfigs(MaLiLibReference.MOD_ID, MaLiLibConfigs.Generic.OPTIONS,
                "malilib.gui.title.generic")).setConfigWidth(240));

        this.addSubPanel((new GuiModConfigs(MaLiLibReference.MOD_ID, MaLiLibConfigs.Debug.OPTIONS,
                "malilib.gui.title.debug")).setConfigWidth(120));

        this.addSubPanel(new ConfigPanelAllHotkeys());
    }
}
