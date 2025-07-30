package com.yalu.addon.mixin;

import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.Setting;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

import static com.yalu.addon.TranslateAddon.MC;
import static com.yalu.addon.TranslateAddon.TRANSLATOR;

@Mixin(value = Setting.class,remap = false)
public class SettingMixin {
    @Mutable
    @Final
    @Shadow
    public String title;
    @Mutable
    @Final
    @Shadow
    public String description;
    @Inject(method = "<init>",at = @At("TAIL"))
    public void init(String name, String description, Object defaultValue, Consumer onChanged, Consumer onModuleActivated, IVisible visible, CallbackInfo ci){
        TRANSLATOR.reload(MC.getResourceManager());
        String SettingKey = "Setting.Meteor." + name;
        String DescriptionKey = "Setting.Meteor." + name + ".Description";
        this.title = TRANSLATOR.Translate(SettingKey,name);
//        this.title = "sb";
        this.description = TRANSLATOR.Translate(DescriptionKey,description);
    }
}
