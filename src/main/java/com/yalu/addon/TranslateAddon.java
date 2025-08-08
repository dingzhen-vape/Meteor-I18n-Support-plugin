package com.yalu.addon;

import com.mojang.logging.LogUtils;
import com.yalu.addon.modules.AboutThisPlugin;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;

public class TranslateAddon extends MeteorAddon {
    public static final String VERSION = "1.0.2";
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("I18n");

    public static final MinecraftClient MC = MeteorClient.mc;
    public static final Translator TRANSLATOR = new Translator();
    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon Template");

        // Modules
        Modules.get().add(new AboutThisPlugin());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.yalu.addon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("dingzhen-vape", "Meteor-I18n-Support-plugin");
    }
}
