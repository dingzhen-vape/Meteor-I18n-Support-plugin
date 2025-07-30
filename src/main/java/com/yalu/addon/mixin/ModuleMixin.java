package com.yalu.addon.mixin;

import com.yalu.addon.TranslateAddon;
import com.yalu.addon.Translator;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.Utils;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.yalu.addon.TranslateAddon.MC;
import static com.yalu.addon.TranslateAddon.TRANSLATOR;

@Mixin(value = Module.class,remap = false,priority = 1001)
public abstract class ModuleMixin {
    @Final
    @Mutable
    @Shadow
    public String title;
    @Mutable
    @Shadow
    @Final
    public String description;
    @Unique
    public String name;
    @Inject(method = "<init>*", at = @At("TAIL"))
    public void onInit(CallbackInfo ci){
        TRANSLATOR.reload(MC.getResourceManager());
        String ModuleKey = "Module.Meteor." + this.name;
        String DescriptionKey = "Module.Meteor." + this.name + ".Description";
        this.title = TRANSLATOR.Translate(ModuleKey, this.name);
        this.description = TRANSLATOR.Translate(DescriptionKey,this.description);
    }
}
