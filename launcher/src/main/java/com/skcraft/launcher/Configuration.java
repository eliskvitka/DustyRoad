/*
 * SK's Minecraft Launcher
 * Copyright (C) 2010-2014 Albert Pham <http://www.sk89q.com> and contributors
 * Please see LICENSE.txt for license information.
 */

package com.skcraft.launcher;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.skcraft.launcher.launch.runtime.JavaRuntime;
import lombok.Data;

/**
 * The configuration for the launcher.
 * </p>
 * Default values are stored as field values. Note that if a default
 * value is changed after the launcher has been deployed, it may not take effect
 * for users who have already used the launcher because the old default
 * values would have been written to disk.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Configuration {

    private boolean offlineEnabled = false;
    private JavaRuntime javaRuntime;
    private String jvmArgs;
    private int minMemory = 1024;
    private int maxMemory = 0; // Updated in Launcher
    private int windowWidth = 854;
    private int windowHeight = 480;
    private String gameKey;
    private boolean serverEnabled = false;
    private String serverHost;
    private int serverPort = 25565;

    private String baseDir;

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
