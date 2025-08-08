package com.yalu.addon.modules;

import com.yalu.addon.TranslateAddon;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.Text;
public class AboutThisPlugin extends Module {

    public AboutThisPlugin() {
        super(TranslateAddon.CATEGORY, "关于翻译插件", "插件作者|译者：食我压路");
    }

    @Override
    public void onActivate() {
        ChatUtils.sendMsg(Text.literal("插件作者|译者：食我压路" +
            "\n翻译插件版本："+ TranslateAddon.VERSION +
            "\n插件描述：为Meteor客户端或其他插件添加了语言文件支持" +
            "\n暂不支持自定义字体" +
            "\n使用AI机翻+人工校验，若有出错请到github仓库上提交issue" +
            "\n本插件完全免费且开源，请勿用于商业用途，且不要上当受骗" +
            "\n如果发现插件翻译不全或出现未翻译的问题请查看版本文件夹根目录下的lang.json或lang/zh_cn.json文件自行翻译"));
//        ChatUtils.sendMsg(Text.literal("点我跳转译者B站主页").styled(s -> s.withClickEvent(new ClickEvent.OpenUrl(URI.create("https://space.bilibili.com/432060575?spm_id_from=333.1007.0.0")))));
//        ChatUtils.sendMsg(Text.literal("点我跳转插件仓库").styled(s -> s.withClickEvent(new ClickEvent.OpenUrl(URI.create("https://github.com/dingzhen-vape/Meteor-Translate-plugin/settings")))));
        ChatUtils.sendMsg(Text.literal("点我跳转译者B站主页").styled(s -> s.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL,("https://space.bilibili.com/432060575?spm_id_from=333.1007.0.0")))));
        ChatUtils.sendMsg(Text.literal("点我跳转插件仓库").styled(s -> s.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL,("https://github.com/dingzhen-vape/Meteor-Translate-plugin/settings")))));
    }
}
