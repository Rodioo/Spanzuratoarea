package com.tonio.spanzuratoarea;

import androidx.annotation.NonNull;

public class Question {
    private String raspunsCorect;
    private String indiciu;

    public String getRaspunsCorect() {
        return raspunsCorect;
    }

    public void setRaspunsCorect(String raspunsCorect) {
        this.raspunsCorect = raspunsCorect;
    }

    public String getIndiciu() {
        return indiciu;
    }

    public void setIndiciu(String indiciu) {
        this.indiciu = indiciu;
    }

    public Question(@NonNull String raspunsCorect, @NonNull String indiciu)
    {
        this.raspunsCorect = raspunsCorect;
        this.indiciu = indiciu;
    }
}
