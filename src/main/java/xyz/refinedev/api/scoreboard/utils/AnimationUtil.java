package xyz.refinedev.api.scoreboard.utils;

import lombok.experimental.UtilityClass;

import net.kyori.adventure.text.Component;

import net.megavex.scoreboardlibrary.api.sidebar.component.animation.CollectionSidebarAnimation;
import net.megavex.scoreboardlibrary.api.sidebar.component.animation.SidebarAnimation;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2024, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Drizzy
 * @version ScoreboardAPI
 * @since 10/9/2024
 */

@UtilityClass
public class AnimationUtil {

    public static SidebarAnimation<Component> createAnimation(List<String> title) {
        List<Component> frames = new ArrayList<>(title.size());
        for (String line : title) {
            frames.add(ColorUtil.translate(line));
        }

        return new CollectionSidebarAnimation<>(frames);
    }

}
