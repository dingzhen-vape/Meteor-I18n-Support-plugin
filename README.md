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
- ！！！本插件未进行全版本测试 目前仅在开发版本1.21.8上测试通过
- ！！！本插件未进行全面的测试，与其他插件一起使用时可能小概率存在冲突，若游戏崩溃，可以尝试将本插件删除

### 待办事项
- [ ] 完善README.md
- [ ] 完善代码注释
- [ ] Baritone的选项翻译

### 鸣谢
我
AI
Meteor开发者


EN Version:
## Meteor I18n Support
#### This plugin adds lang file support to Meteor client, allowing most text to be modified without hardcoding
### How to use
- Use it with Meteor client like any other plugin - just place it in the mods folder.

### Principle
- Meteor's original text is hardcoded directly into the source code.
This plugin extracts all text into separate language files for easy non-hardcoded modifications.
It replaces Module class titles with corresponding text from language files during each load.
- Disables Meteor's custom rendering
- Forces VanillaTextRenderer's scaleIndividually to always be true for proper text display
### Notes
- !!! Not fully tested across all versions - currently only verified on dev version 1.21.8
- !!! Not extensively tested - may have rare conflicts with other plugins. If game crashes, try removing this plugin
### Todo
- [ ] Improve README.md
- [ ] Improve code comments
- [ ] Baritone options translation
### Credits
Me
AI
Meteor Developers

<img width="2560" height="1351" alt="Snipaste_2025-07-31_02-18-44" src="https://github.com/user-attachments/assets/d5d28a82-5da4-456a-8aa0-ec5e35d8e18c" />

<img width="2560" height="1351" alt="Snipaste_2025-07-31_02-19-29" src="https://github.com/user-attachments/assets/af281df7-9e49-44e5-b1cb-a71de21f7ffc" />

