# Meteor I18n Support
#### 这个插件为Meteor本体添加了lang语言文件支持，使大部分文字可以进行非硬编码更改
### How to use
与Meteor本体一起使用 像其他插件一样 放入mods文件夹即可

### 原理
- Meteor本体的语言文件是通过硬编码的方式实现的，即在代码中直接写死了所有文字。

- 而这个插件的作用是将所有文字都抽离到一个单独的语言文件中，这样就可以方便的进行非硬编码的更改。

- 即在每次加载时将Module类的title替换成已有的语言文件中的对应文字。

- 并且禁用了Meteor的自定义渲染

- 使VanillaTextRenderer内的scaleIndividually始终设置成true，以保证文字显示正确

### 注意事项
- ！！！本插件未进行全版本测试
- 经过测试 在1.21以下版本未进行适配无法使用
- ！！！本插件未进行全面的测试，与其他插件一起使用时可能小概率存在冲突，若游戏崩溃，可以尝试将本插件删除
- ！！！本插件可以同步支持其他Meteor插件 需要将版本文件夹根目录lang.json文件内的内容移动到相应的语言文件内（asset/.../lang/XX_XX.json）
- ！！！本插件不会默认适配已经汉化过的Meteor客户端
- ！！！MeteorCN以后可能不会更新

### 待办事项
- [ ] Baritone的选项翻译

### 使用教程 

 [BiliBili](https://www.bilibili.com/video/BV1zX8yzSE9E?spm_id_from=333.788.videopod.sections&vd_source=113cda7aa1ace627d124f6b5f8e83d4c&p=2)

### 鸣谢
我
AI
Meteor开发者
Wurst客户端提供语言文件I18n支持思路

EN Version:
# Meteor I18n Support  
#### This plugin adds lang file support to the Meteor client, enabling non-hardcoded modifications for most text content  
### How to use  
Use it alongside the Meteor client by placing it in the mods folder like any other plugin.  

### Principle  
- Meteor's original language files are hardcoded, meaning all text is directly embedded in the code.  
- This plugin extracts all text into a separate language file, allowing for easy non-hardcoded modifications.  
- During each load, it replaces the `title` of the `Module` class with the corresponding text from the existing language file.  
- It disables Meteor's custom rendering.  
- Ensures `scaleIndividually` in `VanillaTextRenderer` is always set to `true` for proper text display.  

### Notes  
- !!! This plugin has not been fully tested across all versions.  
- Testing shows it is incompatible with versions below 1.21.  
- !!! Comprehensive testing is lacking; conflicts may rarely occur when used with other plugins. If the game crashes, try removing this plugin.  
- !!! It can support other Meteor plugins synchronously. Move the content from the `lang.json` file in the version folder's root to the corresponding language file (`asset/.../lang/XX_XX.json`).  
- !!! This plugin does not default to supporting pre-localized Meteor clients.  
- !!! MeteorCN may not receive future updates.  

### To-Do  
- [ ] Translate Baritone's options.  

### Tutorial  
https://www.bilibili.com/video/BV1zX8yzSE9E?spm_id_from=333.788.videopod.sections&vd_source=113cda7aa1ace627d124f6b5f8e83d4c&p=2  

### Credits  
Me  
AI  
Meteor Developers  
Wurst Client (for the I18n support concept)  


<img width="2560" height="1351" alt="Snipaste_2025-07-31_02-18-44" src="https://github.com/user-attachments/assets/d5d28a82-5da4-456a-8aa0-ec5e35d8e18c" />

<img width="2560" height="1351" alt="Snipaste_2025-07-31_02-19-29" src="https://github.com/user-attachments/assets/af281df7-9e49-44e5-b1cb-a71de21f7ffc" />

