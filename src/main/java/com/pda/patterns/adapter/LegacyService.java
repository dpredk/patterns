package com.pda.patterns.adapter;

public class LegacyService {

    public String processLegacyModel(LegacyModel legacyModel) {
        String info = legacyModel.getInfo() + "_ext";
        return info.toUpperCase();
    }
}
