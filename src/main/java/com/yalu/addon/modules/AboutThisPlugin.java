package com.yalu.addon.modules;

import com.yalu.addon.TranslateAddon;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.datafixer.fix.TextComponentHoverAndClickEventFix;
import net.minecraft.datafixer.fix.TextComponentStringyFlagsFix;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

import javax.swing.text.Style;
import javax.swing.text.StyleContext;
import java.net.URI;

public class AboutThisPlugin extends Module {

    public AboutThisPlugin() {
        super(TranslateAddon.CATEGORY, "关于汉化插件", "插件作者|译者：食我压路");
    }

    @Override
    public void onActivate() {
        ChatUtils.sendMsg(Text.literal("插件作者|译者：食我压路" +
            "\n汉化插件版本："+ TranslateAddon.VERSION +
            "\n插件描述：为Meteor客户端或其他插件添加了语言文件支持" +
            "\n可惜的时汉化版暂不支持自定义字体" +
            "\n使用AI机翻+人工校验，若有出错请到github仓库上提交issue" +
            "\n本插件完全免费且开源，请勿用于商业用途，且不要上当受骗" +
            "\n如果发现插件汉化不全或出现未汉化的问题请查看运行目录下的lang.json或lang/zh_cn.json文件自行汉化"));
        ChatUtils.sendMsg(Text.literal("点我跳转译者B站主页").styled(s -> s.withClickEvent(new ClickEvent.OpenUrl(URI.create("https://space.bilibili.com/432060575?spm_id_from=333.1007.0.0")))));
        ChatUtils.sendMsg(Text.literal("点我跳转插件仓库").styled(s -> s.withClickEvent(new ClickEvent.OpenUrl(URI.create("https://github.com/dingzhen-vape/Meteor-Translate-plugin/settings")))));
    }
}
