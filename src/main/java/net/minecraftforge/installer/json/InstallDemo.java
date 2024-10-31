package net.minecraftforge.installer.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class InstallDemo extends InstallV1 {
    public static Install getDemo(){
        Install install = new Install();
        install.profile = "Actual Legacy";
        install.version = "0";
        install.icon = null;
        install.minecraft = "1.4.7";
        install.id = "/big_logo.png"
        install.path = "";
        install.welcome = "Welcome to the Actual Legacy Installer.",
        install.data = new HashMap();
        install.processors = new ArrayList();
    }

    public InstallDemo(){
        super(getDemo());
    }
}