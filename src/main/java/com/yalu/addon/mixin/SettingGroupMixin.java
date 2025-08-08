package com.yalu.addon.mixin;

import com.yalu.addon.TranslateAddon;
import meteordevelopment.meteorclient.settings.SettingGroup;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = SettingGroup.class,remap = false)
public class SettingGroupMixin {
    @Mutable
    @Shadow
    @Final
    public String name;

    @Inject(method = "<init>",at = @At("RETURN"))
    public void init(String name, boolean sectionExpanded, CallbackInfo ci){


        String GroupKey = "Group.Meteor." + name;
        this.name = TranslateAddon.TRANSLATOR.Translate(GroupKey,name);
    }
}
