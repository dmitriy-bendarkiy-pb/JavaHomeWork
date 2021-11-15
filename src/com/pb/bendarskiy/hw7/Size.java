package com.pb.bendarskiy.hw7;

public enum Size {
    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);

    private final String description;
    private final int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    String getDescription() {
        return description;
    }

    int getEuroSize() {
        return euroSize;
    }
}
