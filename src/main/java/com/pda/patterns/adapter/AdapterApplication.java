package com.pda.patterns.adapter;

public class AdapterApplication {
    public static void main(String[] args) {
        Integer i = 5;
        NewModel newModel = new NewModel(i);
        LegacyModelAdapter legacyModelAdapter = new LegacyModelAdapter(newModel);

        LegacyService legacyService = new LegacyService();
        String result = legacyService.processLegacyModel(legacyModelAdapter);

        assert result.equals("5_EXT");
    }
}
