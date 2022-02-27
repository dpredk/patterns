package com.pda.patterns.adapter;

public class LegacyModelAdapter extends LegacyModel {
    private final NewModel newModel;

    public LegacyModelAdapter(NewModel newModel) {
        this.newModel = newModel;
    }

    @Override
    public String getInfo() {
        return newModel.getInfo().toString();
    }
}
