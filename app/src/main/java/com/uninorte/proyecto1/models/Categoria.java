package com.uninorte.proyecto1.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.uninorte.proyecto1.MyDatabase;

@Table(database = MyDatabase.class)
public class Categoria extends BaseModel {
    @Column
    @PrimaryKey
    int id;

    @Column
    String name;

    @Column
    float peso;

    @Column
    @ForeignKey(saveForeignKeyModel = false)
    Rubrica rubrica;
}
