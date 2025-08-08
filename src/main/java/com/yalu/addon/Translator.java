package com.yalu.addon;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.Language;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiConsumer;

public class Translator {
    private final JsonObject langJson = new JsonObject();
    private TranslationStorage mcEnglish;
    private Map<String, String> currentLangStrings;

    public String Translate(String key,String name) {
        String value = this.currentLangStrings.get(key);
        if(value != null){
            return value;
        }else{
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            langJson.addProperty(key,name);
            Path path = Paths.get("lang.json");
            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                gson.toJson(langJson, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return name;
    }


    public void reload(ResourceManager manager)
    {
        mcEnglish = TranslationStorage.load(manager,
            Lists.newArrayList("en_us.json"), false);

        HashMap<String, String> currentLangStrings = new HashMap<>();
        //从mixin获取管理器然后获取当前语言的语言代码，然后加载翻译文件
//		//这个方法会将语言文件内的键值对赋值给currentLangStrings（这是个HASHMAP（键值对））
        loadTranslations(manager, getCurrentLangCodes(),
            currentLangStrings::put);
        //设置不可变的map 也就是说现在这个currentLangStrings就是当前语言的键值对翻译了
        this.currentLangStrings =
            Collections.unmodifiableMap(currentLangStrings);
    }

    private Iterable<String> getCurrentLangCodes() {
        // Weird bug: Some users have their language set to "en_US" instead of
        // "en_us.json" for some reason. Last seen in 1.21.
        String mainLangCode = MinecraftClient.getInstance().getLanguageManager()
            .getLanguage().toLowerCase();

        ArrayList<String> langCodes = new ArrayList<>();
        langCodes.add("en_us.json");
        if(!"en_us.json".equals(mainLangCode))
            langCodes.add(mainLangCode);

        return langCodes;
    }

    public String translateMc(String key, Object... args)
    {
        if(I18n.hasTranslation(key))
            return I18n.translate(key, args);

        return key;
    }

    private void loadTranslations(ResourceManager manager,
                                  Iterable<String> langCodes, BiConsumer<String, String> entryConsumer)
    {
        //遍历所有已经获取的语言代码
        for(String langCode : langCodes)
        {
            //设置路径
            String langFilePath = "lang/" + langCode + ".json";

            //注册语言ID
            Identifier langId = Identifier.of("yalu", langFilePath);

            for(Resource resource : manager.getAllResources(langId))
                try(InputStream stream = resource.getInputStream())
                {
                    Language.load(stream, entryConsumer);

                }catch(IOException e)
                {
                    e.printStackTrace();
                }
        }
    }

    public Map<String, String> getCurrentLangStrings() {
        return currentLangStrings;
    }

    public TranslationStorage getMcEnglish() {
        return mcEnglish;
    }
}
