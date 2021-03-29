package io.artframework.template;

import io.artframework.Module;
import io.artframework.Scope;
import io.artframework.annotations.ArtModule;

@ArtModule(
    value = "art-module-template",
    description = "Add a short and precise description about your module here.",
    version = "@VERSION@",
    prefix = "art-template",
    depends = {
        // add any plugin or module dependencies of your module here
        // "plugin:Vault"
        // "module:custom-parser"
    },
    autoRegisterArt = true
)
public class TemplateModule implements Module {

    @Override
    public void onLoad(Scope scope) {

    }

    @Override
    public void onReload(Scope scope) {

    }

    @Override
    public void onEnable(Scope scope) {

    }

    @Override
    public void onDisable(Scope scope) {

    }
}
