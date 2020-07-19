package com.weirddev.testme.intellij.template;

import com.weirddev.testme.intellij.common.utils.LanguageUtils;
import com.weirddev.testme.intellij.icon.IconTokensReplacerImpl;
import com.weirddev.testme.intellij.template.context.Language;

/**
 * Date: 10/12/2016
 *
 * @author Yaron Yamin
 */
public class TemplateDescriptor {
    private final Language language;
    private final String tokenizedDisplayName;
    private final String displayName;
    private final String filename;
    private String[] dependantPlugins;

    public TemplateDescriptor(String tokenizedDisplayName, String filename, Language language) {
        this.tokenizedDisplayName = tokenizedDisplayName;
        this.displayName = IconTokensReplacerImpl.stripTokens(tokenizedDisplayName);
        this.filename = filename;
        this.language = language;
        if (language == Language.Groovy) {
            this.dependantPlugins = new String[]{LanguageUtils.GROOVY_PLUGIN_ID};
        } else if (language == Language.Scala) {
            this.dependantPlugins = new String[]{LanguageUtils.SCALA_PLUGIN_ID};
        }
    }

    public String getTokenizedDisplayName() {
        return tokenizedDisplayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getFilename() {
        return filename;
    }
    public boolean isEnabled() {
        return true;
    }

    public Language getLanguage() {
        return language;
    }
}
